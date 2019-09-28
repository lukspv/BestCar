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
    private int Loid;
    private double Lovldiaria;
    private char Loestatus;
    private int Loqtdias;
    private String Lodtini;
    private String Lodtfim;
    private Carro carro;
    private Cliente cliente;
    private Usuario usuario;

    /**
     * @return the Loid
     */
    public int getLoid() {
        return Loid;
    }

    /**
     * @param Loid the Loid to set
     */
    public void setLoid(int Loid) {
        this.Loid = Loid;
    }

    /**
     * @return the Lovldiaria
     */
    public double getLovldiaria() {
        return Lovldiaria;
    }

    /**
     * @param Lovldiaria the Lovldiaria to set
     */
    public void setLovldiaria(double Lovldiaria) {
        this.Lovldiaria = Lovldiaria;
    }

    /**
     * @return the Loestatus
     */
    public char getLoestatus() {
        return Loestatus;
    }

    /**
     * @param Loestatus the Loestatus to set
     */
    public void setLoestatus(char Loestatus) {
        this.Loestatus = Loestatus;
    }

    /**
     * @return the Loqtdias
     */
    public int getLoqtdias() {
        return Loqtdias;
    }

    /**
     * @param Loqtdias the Loqtdias to set
     */
    public void setLoqtdias(int Loqtdias) {
        this.Loqtdias = Loqtdias;
    }

    /**
     * @return the Lodtini
     */
    public String getLodtini() {
        return Lodtini;
    }

    /**
     * @param Lodtini the Lodtini to set
     */
    public void setLodtini(String Lodtini) {
        this.Lodtini = Lodtini;
    }

    /**
     * @return the Lodtfim
     */
    public String getLodtfim() {
        return Lodtfim;
    }

    /**
     * @param Lodtfim the Lodtfim to set
     */
    public void setLodtfim(String Lodtfim) {
        this.Lodtfim = Lodtfim;
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
