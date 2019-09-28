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
public class Fabricante {
    private String Facnpj;
    private String Fanome;

    /**
     * @return the Facnpj
     */
    public String getFacnpj() {
        return Facnpj;
    }

    /**
     * @param Facnpj the Facnpj to set
     */
    public void setFacnpj(String Facnpj) {
        this.Facnpj = Facnpj;
    }

    /**
     * @return the Fanome
     */
    public String getFanome() {
        return Fanome;
    }

    /**
     * @param Fanome the Fanome to set
     */
    public void setFanome(String Fanome) {
        this.Fanome = Fanome;
    }
    
    
}
