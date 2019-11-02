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
    private String clicnh;
    private String clinome;
    private String clifone;
    private String clidtnasc;
    private Endereco endereco;

    /**
     * @return the clicnh
     */
    public String getclicnh() {
        return clicnh;
    }

    /**
     * @param clicnh the clicnh to set
     */
    public void setclicnh(String clicnh) {
        this.clicnh = clicnh;
    }

    /**
     * @return the clinome
     */
    public String getclinome() {
        return clinome;
    }

    /**
     * @param clinome the clinome to set
     */
    public void setclinome(String clinome) {
        this.clinome = clinome;
    }

    /**
     * @return the clifone
     */
    public String getclifone() {
        return clifone;
    }

    /**
     * @param clifone the clifone to set
     */
    public void setclifone(String clifone) {
        this.clifone = clifone;
    }

    /**
     * @return the clidtnasc
     */
    public String getclidtnasc() {
        return clidtnasc;
    }

    /**
     * @param clidtnasc the clidtnasc to set
     */
    public void setclidtnasc(String clidtnasc) {
        this.clidtnasc = clidtnasc;
    }

    /**
     * @return the endereco
     */
    public Endereco getendereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setendereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
    
}
