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
public class Carro {
    private String caplaca;
    private String caano;
    private double cavldiaria;
    private Acessorio acessorio;
    private Modelo modelo;

    /**
     * @return the caplaca
     */
    public String getcaplaca() {
        return caplaca;
    }

    /**
     * @param caplaca the caplaca to set
     */
    public void setcaplaca(String caplaca) {
        this.caplaca = caplaca;
    }

    /**
     * @return the caano
     */
    public String getcaano() {
        return caano;
    }

    /**
     * @param caano the caano to set
     */
    public void setcaano(String caano) {
        this.caano = caano;
    }

    /**
     * @return the cavldiaria
     */
    public double getcavldiaria() {
        return cavldiaria;
    }

    /**
     * @param cavldiaria the cavldiaria to set
     */
    public void setcavldiaria(double cavldiaria) {
        this.cavldiaria = cavldiaria;
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
     * @return the modelo
     */
    public Modelo getmodelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setmodelo(Modelo modelo) {
        this.modelo = modelo;
    }
    
    
    
}
