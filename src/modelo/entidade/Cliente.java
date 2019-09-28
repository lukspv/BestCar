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
public class Cliente {
    private String Clicnh;
    private String Clinome;
    private String Clifone;
    private String Clidtnasc;
    private Endereco endereco;

    /**
     * @return the Clicnh
     */
    public String getClicnh() {
        return Clicnh;
    }

    /**
     * @param Clicnh the Clicnh to set
     */
    public void setClicnh(String Clicnh) {
        this.Clicnh = Clicnh;
    }

    /**
     * @return the Clinome
     */
    public String getClinome() {
        return Clinome;
    }

    /**
     * @param Clinome the Clinome to set
     */
    public void setClinome(String Clinome) {
        this.Clinome = Clinome;
    }

    /**
     * @return the Clifone
     */
    public String getClifone() {
        return Clifone;
    }

    /**
     * @param Clifone the Clifone to set
     */
    public void setClifone(String Clifone) {
        this.Clifone = Clifone;
    }

    /**
     * @return the Clidtnasc
     */
    public String getClidtnasc() {
        return Clidtnasc;
    }

    /**
     * @param Clidtnasc the Clidtnasc to set
     */
    public void setClidtnasc(String Clidtnasc) {
        this.Clidtnasc = Clidtnasc;
    }

    /**
     * @return the endereco
     */
    public Endereco getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
    
}
