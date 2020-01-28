/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package povezivanjesabazom;

import java.sql.SQLException;
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
public class Kontroler {

    private static Kontroler instance;

    public Kontroler() {

    }

    public static Kontroler getInstance() {
        if (instance == null) {
            instance = new Kontroler();
        }
        return instance;
    }

    public List<ModeliAudi> ucitajSveAudiModele() throws SQLException {
        DBBroker.getInstance().poveziSe();
        return DBBroker.getInstance().ucitajSveAudiModele();
    }

    public List<ModeliVW> ucitajSveVWModele() throws SQLException {
        DBBroker.getInstance().poveziSe();
        return DBBroker.getInstance().ucitajSveVWModele();
    }

    public void sacuvajVozilo(Vozila v) throws SQLException {
        DBBroker.getInstance().poveziSe();
        DBBroker.getInstance().sacuvajVozilo(v);
    }

    public List<Vozila> prikaziSvaVozila() throws SQLException {
        DBBroker.getInstance().poveziSe();
        return DBBroker.getInstance().prikaziSvaVozila();
    }

    public void obrisiVozilo(String selektovaniRed) {
        try {
            DBBroker.getInstance().poveziSe();
            DBBroker.getInstance().obrisiVozilo(selektovaniRed);
        } catch (SQLException ex) {
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


}
