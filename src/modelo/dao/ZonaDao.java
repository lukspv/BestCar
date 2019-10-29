/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.conexao.FabricaConexao;
import modelo.entidade.*;
/**
 *
 * @author lucas
 */
public class ZonaDao {
    
    private String Comando;//comando sql
    private PreparedStatement ps;//preparando o ambiente para o comando sql (intermediario)
    private ResultSet rs;// armazenar os dados do banco da aplicação (apenas nas consultas)
    private Connection Conecta;
    
    
    
    //metodos
    
    public void cadastrar(Zona zona) throws SQLException{
        
        Conecta=FabricaConexao.Conectar();
        Comando="insert into Zona (Zonome) values (?);";
        ps=Conecta.prepareStatement(Comando);
       
        ps.setString(1, zona.getzonome());
        ps.execute();
        
        FabricaConexao.FecharConexao();
        //JOptionPane.showMessageDialog(null,"Salvou");
      
        
    }
    
    public void alterar(Zona zona) throws SQLException{
        
        Conecta=FabricaConexao.Conectar();
        Comando="update Zona set Zonome = ? where Zoid=?;";
        ps=Conecta.prepareStatement(Comando);
        ps.setString(1, zona.getzonome());
        ps.setInt(2, zona.getzoid());
        ps.execute();
        
        FabricaConexao.FecharConexao();
        
        
        
        
    }
    
        public void excluir(int id) throws SQLException{
        
        Conecta=FabricaConexao.Conectar();
        Comando="delete from Zona where Zoid=?;";
        ps=Conecta.prepareStatement(Comando);
        ps.setInt(1,id);
        ps.execute();
        
        FabricaConexao.FecharConexao();
        }
        
        
        public List<Zona> listarTodos(String nome) throws SQLException{
            
        Conecta=FabricaConexao.Conectar();
        Comando="select * from Zona where Zonome '"+nome+"%';";
        //"select * from Zona where Zonome like ?"
        ps=Conecta.prepareStatement(Comando);
        //ps.setString(1,nome+"%"); 
        rs=ps.executeQuery();
        
   
        List<Zona> lista = new ArrayList<>();
        while(rs.next()){
            Zona zona = new Zona();
            
            zona.setzoid(rs.getInt("Zoid"));
            zona.setzonome(rs.getString("Zonome"));
            
            lista.add(zona);
            
            
        }
        
        FabricaConexao.FecharConexao();
        return lista;

            
        }
        
        public Zona buscar(int id) throws SQLException{
            
        Conecta=FabricaConexao.Conectar();
        Comando="select * from Zona where Zoid = "+ id +";";
        //"select * from Zona where Zonome like ?"
        ps=Conecta.prepareStatement(Comando);
        //ps.setString(1,nome+"%"); 
        rs=ps.executeQuery();
        
        Zona zona = new Zona();
        //List<Zona> lista = new ArrayList<>();
        while(rs.next()){
            
            
            zona.setzoid(rs.getInt("Zoid"));
            zona.setzonome(rs.getString("Zonome"));
            
         //   lista.add(zona);
            
            
        }
        
        FabricaConexao.FecharConexao();
        return zona;

            
        }
    
    
}