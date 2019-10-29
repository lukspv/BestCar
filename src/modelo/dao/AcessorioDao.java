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
import modelo.conexao.FabricaConexao;
import modelo.entidade.*;

/**
 *
 * @author lucas
 */
public class AcessorioDao {
    
    
    private String Comando;//comando sql
    private PreparedStatement ps;//preparando o ambiente para o comando sql (intermediario)
    private ResultSet rs;// armazenar os dados do banco da aplicação (apenas nas consultas)
    private Connection Conecta;
    
    
    
    //metodos
    
    public void cadastrar(Acessorio acessorio) throws SQLException{
        
        Conecta=FabricaConexao.Conectar();
        Comando="insert into Acessorio (Acedesc) values (?);";
        ps=Conecta.prepareStatement(Comando);
       
        ps.setString(1, acessorio.getacesdesc());
        ps.execute();
        
        FabricaConexao.FecharConexao();
      
        
    }
    
    public void alterar(Acessorio acessorio) throws SQLException{
        
        Conecta=FabricaConexao.Conectar();
        Comando="update Acessorio set Acedesc = ? where Aceid=?;";
        ps=Conecta.prepareStatement(Comando);
        ps.setString(1, acessorio.getacesdesc());
        ps.setInt(2, acessorio.getaceid());
        ps.execute();
        
        FabricaConexao.FecharConexao();
        
        
        
        
    }
    
        public void excluir(int id) throws SQLException{
        
        Conecta=FabricaConexao.Conectar();
        Comando="delete from Acessorio where Aceid=?;";
        ps=Conecta.prepareStatement(Comando);
        ps.setInt(1,id);
        ps.execute();
        
        FabricaConexao.FecharConexao();
        }
        
        
        public List<Acessorio> listarTodos(String nome) throws SQLException{
            
        Conecta=FabricaConexao.Conectar();
        Comando="select * from Acessorio where Acedesc '"+nome+"%';";
        //"select * from Zona where Zonome like ?"
        ps=Conecta.prepareStatement(Comando);
        //ps.setString(1,nome+"%"); 
        rs=ps.executeQuery();
        
   
        List<Acessorio> lista = new ArrayList<>();
        while(rs.next()){
            Acessorio acessorio = new Acessorio();
            
            acessorio.setaceid(rs.getInt("Aceid"));
            acessorio.setacesdesc(rs.getString("Acdesc"));
            
            lista.add(acessorio);
            
            
        }
        
        FabricaConexao.FecharConexao();
        return lista;

            
        }
        
        public Acessorio buscar(int id) throws SQLException{
            
        Conecta=FabricaConexao.Conectar();
        Comando="select * from Acessorio where Aceid ="+id+";";
        //"select * from Zona where Zonome like ?"
        ps=Conecta.prepareStatement(Comando);
        //ps.setString(1,nome+"%"); 
        rs=ps.executeQuery();
        
        Acessorio acessorio = new Acessorio();
        //List<Zona> lista = new ArrayList<>();
        while(rs.next()){
            
            
            acessorio.setaceid(rs.getInt("Aceid"));
            acessorio.setacesdesc(rs.getString("Acedesc"));
            
         //   lista.add(acessorio);
            
            
        }
        
        FabricaConexao.FecharConexao();
        return acessorio;

            
        }
    
}
