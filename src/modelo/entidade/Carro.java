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
    private String Caplaca;
    private String Caano;
    private double Cavldiaria;
    private Acessorio acessorio;
    private Modelo modelo;

    /**
     * @return the Caplaca
     */
    public String getCaplaca() {
        return Caplaca;
    }

    /**
     * @param Caplaca the Caplaca to set
     */
    public void setCaplaca(String Caplaca) {
        this.Caplaca = Caplaca;
    }

    /**
     * @return the Caano
     */
    public String getCaano() {
        return Caano;
    }

    /**
     * @param Caano the Caano to set
     */
    public void setCaano(String Caano) {
        this.Caano = Caano;
    }

    /**
     * @return the Cavldiaria
     */
    public double getCavldiaria() {
        return Cavldiaria;
    }

    /**
     * @param Cavldiaria the Cavldiaria to set
     */
    public void setCavldiaria(double Cavldiaria) {
        this.Cavldiaria = Cavldiaria;
    }

    /**
     * @return the acessorio
     */
    public Acessorio getAcessorio() {
        return acessorio;
    }

    /**
     * @param acessorio the acessorio to set
     */
    public void setAcessorio(Acessorio acessorio) {
        this.acessorio = acessorio;
    }

    /**
     * @return the modelo
     */
    public Modelo getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }
    
    
    
}
