/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osnovneklase;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author lucca
 */
public class ModelTabeleVozila extends AbstractTableModel {

    private final List<Vozila> listaVozila;
    private final String naziviKolona[];

    public ModelTabeleVozila(List<Vozila> listaVozila) {
        this.listaVozila = listaVozila;
        naziviKolona = new String[]{"Redni broj", "ID", "Marka vozila", "Model vozila", "Vreme", "Datum", "Kilometraza", "Broj sasije", "Registarska oznaka", "Redovne servisne usluge", "Dodatne servisne usluge", "Napomene"};
    }

    @Override
    public int getRowCount() {
        return listaVozila.size();
    }

    @Override
    public int getColumnCount() {
        return naziviKolona.length;
    }

    @Override
    public Object getValueAt(int red, int kolona) {
        Vozila v = listaVozila.get(red);
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        switch (kolona) {

            case 0:
                return red + 1;
            case 1:
                return v.getID();       // da bi se poklopilo sa mysql tabelom jer tamo radi auto increment od 1, a ovde bi red bio samo 0!
            case 2:
                return v.getMarkaVozila();
            case 3:
                return v.getModelVozila();
            case 4:
                return v.getVreme();
            case 5:
                return sdf.format(v.getDatum());
            case 6:
                return v.getKilometraza();
            case 7:
                return v.getBrojSasije();
            case 8:
                return v.getRegistarskaOznaka();
            case 9:
                return v.getRedovneServisneUsluge();
            case 10:
                return v.getDodatneServisneUsluge();
            case 11:
                return v.getNapomene();
            default:
                return null;
        }

    }

    @Override
    public String getColumnName(int nazivKolone) {
        return naziviKolona[nazivKolone];
    }

    @Override
    public Class<?> getColumnClass(int indeksKolone) {       // klasa za sortiranje tabela kolona (treba mi jer integer se ne sortira po defaultu pomocu "tblVozila.setAutoCreateRowSorter(true)";)
        if (indeksKolone == 0 || indeksKolone == 1 || indeksKolone == 6) {
            return Integer.class;
        } else {
            return String.class;
        }
    }

    public void obrisiVozilo(int selektovaniRedZaBrisanje) throws SQLException {
        listaVozila.remove(selektovaniRedZaBrisanje);
        fireTableDataChanged();

    }

}
