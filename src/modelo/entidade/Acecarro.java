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
public class Acecarro {
    private int acaid;
    private Acessorio acessorio;
    private Carro carro;

    /**
     * @return the acaid
     */
    public int getacaid() {
        return acaid;
    }

    /**
     * @param acaid the acaid to set
     */
    public void setacaid(int acaid) {
        this.acaid = acaid;
    }

    /**
     * @return the acessorio
     */
    public Acessorio getacessorio() {
        return acessorio;
    }

    /**
     * @param acessorio the acessorio to set
     */
    public void setacessorio(Acessorio acessorio) {
        this.acessorio = acessorio;
    }

    /**
     * @return the carro
     */
    public Carro getcarro() {
        return carro;
    }

    /**
     * @param carro the carro to set
     */
    public void setcarro(Carro carro) {
        this.carro = carro;
    }
    
    
}
