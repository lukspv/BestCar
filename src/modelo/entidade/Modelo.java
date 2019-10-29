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
    private int moid;
    private String modesc;
    private Fabricante fabricante;

    /**
     * @return the moid
     */
    public int getmoid() {
        return moid;
    }

    /**
     * @param moid the moid to set
     */
    public void setmoid(int moid) {
        this.moid = moid;
    }

    /**
     * @return the modesc
     */
    public String getmodesc() {
        return modesc;
    }

    /**
     * @param modesc the modesc to set
     */
    public void setmodesc(String modesc) {
        this.modesc = modesc;
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
