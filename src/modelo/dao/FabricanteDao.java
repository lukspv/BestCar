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
public class FabricanteDao {
    private String Comando;//comando sql
    private PreparedStatement ps;//preparando o ambiente para o comando sql (intermediario)
    private ResultSet rs;// armazenar os dados do banco da aplicação (apenas nas consultas)
    private Connection Conecta;
    
    
    
    //metodos
    
    public void cadastrar(Fabricante fabricante) throws SQLException{
        
        Conecta=FabricaConexao.Conectar();
        Comando="insert into Fabricante (Facnpj,Fanome) values (?,?);";
        ps=Conecta.prepareStatement(Comando);
       
        ps.setString(1, fabricante.getfacnpj());
        ps.setString(2, fabricante.getfanome());
        ps.execute();
        
        FabricaConexao.FecharConexao();
      
        
    }
    
    public void alterar(Fabricante fabricante) throws SQLException{
        
        Conecta=FabricaConexao.Conectar();
        Comando="update Fabricante set Fanome = ? where Facnpj=?;";
        ps=Conecta.prepareStatement(Comando);
        ps.setString(1, fabricante.getfanome());
        ps.setString(2, fabricante.getfacnpj());
        ps.execute();
        
        FabricaConexao.FecharConexao();
        
        
        
        
    }
    
        public void excluir(String id) throws SQLException{
        
        Conecta=FabricaConexao.Conectar();
        Comando="delete from Fabricante where Facnpj=?;";
        ps=Conecta.prepareStatement(Comando);
        ps.setString(1,id);
        ps.execute();
        
        FabricaConexao.FecharConexao();
        }
        
        
        public List<Fabricante> listarTodos() throws SQLException{
            
        Conecta=FabricaConexao.Conectar();
        Comando="select * from Fabricante;";
        ps=Conecta.prepareStatement(Comando); 
        rs=ps.executeQuery();
        
   
        List<Fabricante> lista = new ArrayList<>();
        while(rs.next()){
            Fabricante fabricante = new Fabricante();
            fabricante.setfacnpj(rs.getString("Facnpj"));
            fabricante.setfanome(rs.getString("Fanome"));
            lista.add(fabricante);
        }
        
        FabricaConexao.FecharConexao();
        return lista;   
        }
        
        
        public List<Fabricante> listarTodos(String nome) throws SQLException{
            
        Conecta=FabricaConexao.Conectar();
        Comando="select * from Fabricante where Fanome '"+nome+"%';";
        //"select * from Zona where Zonome like ?"
        ps=Conecta.prepareStatement(Comando);
        //ps.setString(1,nome+"%"); 
        rs=ps.executeQuery();
        
   
        List<Fabricante> lista = new ArrayList<>();
        while(rs.next()){
            Fabricante fabricante = new Fabricante();
            
            fabricante.setfacnpj(rs.getString("Facnpj"));
            fabricante.setfanome(rs.getString("Fanome"));
            
            lista.add(fabricante);
            
            
        }
        
        FabricaConexao.FecharConexao();
        return lista;

            
        }
        
        public Fabricante buscar(String id) throws SQLException{
            
        Conecta=FabricaConexao.Conectar();
        Comando="select * from Fabricante where Facnpj = "+id+";";
        //"select * from Zona where Zonome like ?"
        ps=Conecta.prepareStatement(Comando);
        //ps.setString(1,nome+"%"); 
        rs=ps.executeQuery();
        
        Fabricante fabricante = new Fabricante();
        //List<Zona> lista = new ArrayList<>();
        while(rs.next()){
            
            
            fabricante.setfacnpj(rs.getString("Facnpj"));
            fabricante.setfanome(rs.getString("Fanome"));
            

            
         //   lista.add(fabricante);
            
            
        }
        
        FabricaConexao.FecharConexao();
        return fabricante;

            
        }
}
