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
public class Usuario {
    private int Usid;
    private String Usnome;
    private String Uslogin;
    private String Ussenha;

    /**
     * @return the Usid
     */
    public int getUsid() {
        return Usid;
    }

    /**
     * @param Usid the Usid to set
     */
    public void setUsid(int Usid) {
        this.Usid = Usid;
    }

    /**
     * @return the Usnome
     */
    public String getUsnome() {
        return Usnome;
    }

    /**
     * @param Usnome the Usnome to set
     */
    public void setUsnome(String Usnome) {
        this.Usnome = Usnome;
    }

    /**
     * @return the Uslogin
     */
    public String getUslogin() {
        return Uslogin;
    }

    /**
     * @param Uslogin the Uslogin to set
     */
    public void setUslogin(String Uslogin) {
        this.Uslogin = Uslogin;
    }

    /**
     * @return the Usenha
     */
    public String getUssenha() {
        return Ussenha;
    }

    /**
     * @param Usenha the Usenha to set
     */
    public void setUssenha(String Ussenha) {
        this.Ussenha = Ussenha;
    }
    
    
    
}
