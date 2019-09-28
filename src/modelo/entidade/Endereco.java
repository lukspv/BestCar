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
    private String Encep;
    private String Enrua;
    private String Ennumero;
    private Bairro bairro;

    /**
     * @return the Encep
     */
    public String getEncep() {
        return Encep;
    }

    /**
     * @param Encep the Encep to set
     */
    public void setEncep(String Encep) {
        this.Encep = Encep;
    }

    /**
     * @return the Enrua
     */
    public String getEnrua() {
        return Enrua;
    }

    /**
     * @param Enrua the Enrua to set
     */
    public void setEnrua(String Enrua) {
        this.Enrua = Enrua;
    }

    /**
     * @return the Ennumero
     */
    public String getEnnumero() {
        return Ennumero;
    }

    /**
     * @param Ennumero the Ennumero to set
     */
    public void setEnnumero(String Ennumero) {
        this.Ennumero = Ennumero;
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
