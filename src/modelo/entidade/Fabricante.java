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
    private String facnpj;
    private String fanome;

    /**
     * @return the facnpj
     */
    public String getfacnpj() {
        return facnpj;
    }

    /**
     * @param facnpj the facnpj to set
     */
    public void setfacnpj(String facnpj) {
        this.facnpj = facnpj;
    }

    /**
     * @return the fanome
     */
    public String getfanome() {
        return fanome;
    }

    /**
     * @param fanome the fanome to set
     */
    public void setfanome(String fanome) {
        this.fanome = fanome;
    }

    @Override
    public String toString() {
        return fanome;
    }


    
    
    
}
