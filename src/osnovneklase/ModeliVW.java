/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osnovneklase;

/**
 *
 * @author lucca
 */
public class ModeliVW extends AbstractModeli {

    public ModeliVW() {
    }

    public ModeliVW(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return model;
    }

}
