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
public class Modelo {
    private int Moid;
    private String Modesc;
    private Fabricante fabricante;

    /**
     * @return the Moid
     */
    public int getMoid() {
        return Moid;
    }

    /**
     * @param Moid the Moid to set
     */
    public void setMoid(int Moid) {
        this.Moid = Moid;
    }

    /**
     * @return the Modesc
     */
    public String getModesc() {
        return Modesc;
    }

    /**
     * @param Modesc the Modesc to set
     */
    public void setModesc(String Modesc) {
        this.Modesc = Modesc;
    }

    /**
     * @return the fabricante
     */
    public Fabricante getFabricante() {
        return fabricante;
    }

    /**
     * @param fabricante the fabricante to set
     */
    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }
    
    
    
}
