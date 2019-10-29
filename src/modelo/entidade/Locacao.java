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
public class Locacao {
    private int loid;
    private double lovldiaria;
    private char loestatus;
    private int loqtdias;
    private String lodtini;
    private String lodtfim;
    private Carro carro;
    private Cliente cliente;
    private Usuario usuario;

    /**
     * @return the loid
     */
    public int getloid() {
        return loid;
    }

    /**
     * @param loid the loid to set
     */
    public void setloid(int loid) {
        this.loid = loid;
    }

    /**
     * @return the lovldiaria
     */
    public double getlovldiaria() {
        return lovldiaria;
    }

    /**
     * @param lovldiaria the lovldiaria to set
     */
    public void setlovldiaria(double lovldiaria) {
        this.lovldiaria = lovldiaria;
    }

    /**
     * @return the loestatus
     */
    public char getloestatus() {
        return loestatus;
    }

    /**
     * @param loestatus the loestatus to set
     */
    public void setloestatus(char loestatus) {
        this.loestatus = loestatus;
    }

    /**
     * @return the loqtdias
     */
    public int getloqtdias() {
        return loqtdias;
    }

    /**
     * @param loqtdias the loqtdias to set
     */
    public void setloqtdias(int loqtdias) {
        this.loqtdias = loqtdias;
    }

    /**
     * @return the lodtini
     */
    public String getlodtini() {
        return lodtini;
    }

    /**
     * @param lodtini the lodtini to set
     */
    public void setlodtini(String lodtini) {
        this.lodtini = lodtini;
    }

    /**
     * @return the lodtfim
     */
    public String getlodtfim() {
        return lodtfim;
    }

    /**
     * @param lodtfim the lodtfim to set
     */
    public void setlodtfim(String lodtfim) {
        this.lodtfim = lodtfim;
    }

    /**
     * @return the carro
     */
    public Carro getCarro() {
        return carro;
    }

    /**
     * @param carro the carro to set
     */
    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
}
