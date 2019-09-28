/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.entidade;

/**
 *
 * @author lucas
 */
public class Bairro {
    
    private int Baid;
    private String Banome;
    private Zona zona;

    /**
     * @return the Baid
     */
    public int getBaid() {
        return Baid;
    }

    /**
     * @param Baid the Baid to set
     */
    public void setBaid(int Baid) {
        this.Baid = Baid;
    }

    /**
     * @return the Banome
     */
    public String getBanome() {
        return Banome;
    }

    /**
     * @param Banome the Banome to set
     */
    public void setBanome(String Banome) {
        this.Banome = Banome;
    }

    /**
     * @return the zona
     */
    public Zona getZona() {
        return zona;
    }

    /**
     * @param zona the zona to set
     */
    public void setZona(Zona zona) {
        this.zona = zona;
    }
    
}
