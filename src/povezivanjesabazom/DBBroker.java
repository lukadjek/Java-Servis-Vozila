/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package povezivanjesabazom;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import osnovneklase.ModeliAudi;
import osnovneklase.ModeliVW;
import osnovneklase.Vozila;

/**
 *
 * @author lucca
 */
public class DBBroker {

    private Connection konekcija;
    private static DBBroker instance;

    private DBBroker() {

    }

    public static DBBroker getInstance() {

        if (instance == null) {
            instance = new DBBroker();
        }

        return instance;

    }

    public void poveziSe() throws SQLException {

        if (konekcija == null || konekcija.isClosed()) {
            konekcija = DriverManager.getConnection("jdbc:mysql://localhost:3306/Servis_Vozila?useSSL=false", "root", "lucca");
        }

    }

    public List<ModeliAudi> ucitajSveAudiModele() throws SQLException {
        String upit = "select * from Marka_AUDI";
        List listaAudiVozila = new ArrayList();
        Statement naredba = konekcija.createStatement();
        ResultSet rs = naredba.executeQuery(upit);

        while (rs.next()) {
            ModeliAudi audi = new ModeliAudi();
            audi.setModel(rs.getString(1));

            listaAudiVozila.add(audi);
        }
        return listaAudiVozila;
    }

    public List<ModeliVW> ucitajSveVWModele() throws SQLException {
        String upit = "select * from Marka_VW";
        List listaVWVozila = new ArrayList();
        Statement naredba = konekcija.createStatement();
        ResultSet rs = naredba.executeQuery(upit);

        while (rs.next()) {
            ModeliVW vw = new ModeliVW();
            vw.setModel(rs.getString(1));

            listaVWVozila.add(vw);
        }
        return listaVWVozila;
    }
    
    public void sacuvajVozilo(Vozila v) throws SQLException {

        String upit = "insert into vozila values (?,?,?,?,?,?,?,?,?,?, ?)";
        
        PreparedStatement pripremljenaNaredba = konekcija.prepareStatement(upit);
        
        pripremljenaNaredba.setInt(1, v.getID());
        pripremljenaNaredba.setString(2, v.getMarkaVozila());
        pripremljenaNaredba.setString(3, v.getModelVozila());
        pripremljenaNaredba.setString(4, v.getVreme());
        pripremljenaNaredba.setDate(5, new java.sql.Date(v.getDatum().getTime()));
        pripremljenaNaredba.setInt(6, v.getKilometraza());
        pripremljenaNaredba.setString(7, v.getBrojSasije());
        pripremljenaNaredba.setString(8, v.getRegistarskaOznaka());
        pripremljenaNaredba.setString(9, v.getRedovneServisneUsluge());
        pripremljenaNaredba.setString(10, v.getDodatneServisneUsluge());
        pripremljenaNaredba.setString(11, v.getNapomene());
        
        pripremljenaNaredba.executeUpdate();
    }
    
    public List<Vozila> prikaziSvaVozila() throws SQLException {
        
        String upit = "Select * from vozila";
        List<Vozila> listaVozila = new ArrayList<Vozila>();
        Statement st = konekcija.createStatement();
        ResultSet rs = st.executeQuery(upit);        
        
        while (rs.next()) {
            Vozila v = new Vozila();
            v.setID(rs.getInt("ID"));
            v.setMarkaVozila(rs.getString("MarkaVozila"));
            v.setModelVozila(rs.getString("ModelVozila"));
            v.setVreme(rs.getString("Vreme"));
            v.setDatum(rs.getDate("Datum"));
            v.setKilometraza(rs.getInt("Kilometraza"));
            v.setBrojSasije(rs.getString("BrojSasije"));
            v.setRegistarskaOznaka(rs.getString("RegistarskaOznaka"));
            v.setRedovneServisneUsluge(rs.getString("RedovneServisneUsluge"));
            
                v.setDodatneServisneUsluge(rs.getString("DodatneServisneUsluge"));

            v.setNapomene(rs.getString("Napomene"));
            
            listaVozila.add(v);
        }
        return listaVozila;
        
    }
    
    public void obrisiVozilo(String selektovaniRed) {                   
        try {
        String upit = "delete from vozila where ID = ?";
        PreparedStatement pripremljenaNaredba = konekcija.prepareStatement(upit);
        pripremljenaNaredba.setString(1, selektovaniRed);
        pripremljenaNaredba.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      
    }  

}
