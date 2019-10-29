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
public class Endereco {
    private String encep;
    private String enrua;
    private String ennumero;
    private Bairro bairro;

    /**
     * @return the encep
     */
    public String getencep() {
        return encep;
    }

    /**
     * @param encep the encep to set
     */
    public void setencep(String encep) {
        this.encep = encep;
    }

    /**
     * @return the enrua
     */
    public String getenrua() {
        return enrua;
    }

    /**
     * @param enrua the enrua to set
     */
    public void setenrua(String enrua) {
        this.enrua = enrua;
    }

    /**
     * @return the ennumero
     */
    public String getennumero() {
        return ennumero;
    }

    /**
     * @param ennumero the ennumero to set
     */
    public void setennumero(String ennumero) {
        this.ennumero = ennumero;
    }

    /**
     * @return the bairro
     */
    public Bairro getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }
    
    
    
}
