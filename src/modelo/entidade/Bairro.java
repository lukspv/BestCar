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
    
    private int baid;
    private String banome;
    private Zona zona;

    /**
     * @return the baid
     */
    public int getbaid() {
        return baid;
    }

    /**
     * @param baid the baid to set
     */
    public void setbaid(int baid) {
        this.baid = baid;
    }

    /**
     * @return the banome
     */
    public String getbanome() {
        return banome;
    }

    /**
     * @param banome the banome to set
     */
    public void setbanome(String banome) {
        this.banome = banome;
    }

    /**
     * @return the zona
     */
    public Zona getzona() {
        return zona;
    }

    /**
     * @param zona the zona to set
     */
    public void setzona(Zona zona) {
        this.zona = zona;
    }
    
}
