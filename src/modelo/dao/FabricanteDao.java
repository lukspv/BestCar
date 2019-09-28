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
    
    public void Cadastrar(Fabricante fabricante) throws SQLException{
        
        Conecta=FabricaConexao.Conectar();
        Comando="insert into Fabricante (Facnpj,Fanome) values (?,?);";
        ps=Conecta.prepareStatement(Comando);
       
        ps.setString(1, fabricante.getFacnpj());
        ps.setString(2, fabricante.getFanome());
        ps.execute();
        
        FabricaConexao.FecharConexao();
      
        
    }
    
    public void Alterar(Fabricante fabricante) throws SQLException{
        
        Conecta=FabricaConexao.Conectar();
        Comando="update Fabricante set Fanome = ? where Facnpj=?;";
        ps=Conecta.prepareStatement(Comando);
        ps.setString(1, fabricante.getFanome());
        ps.setString(2, fabricante.getFacnpj());
        ps.execute();
        
        FabricaConexao.FecharConexao();
        
        
        
        
    }
    
        public void Excluir(String id) throws SQLException{
        
        Conecta=FabricaConexao.Conectar();
        Comando="delete from Fabricante where Facnpj=?;";
        ps=Conecta.prepareStatement(Comando);
        ps.setString(1,id);
        ps.execute();
        
        FabricaConexao.FecharConexao();
        }
        
        
        public List<Fabricante> ListarTodos(String nome) throws SQLException{
            
        Conecta=FabricaConexao.Conectar();
        Comando="select * from Fabricante where Fanome '"+nome+"%';";
        //"select * from Zona where Zonome like ?"
        ps=Conecta.prepareStatement(Comando);
        //ps.setString(1,nome+"%"); 
        rs=ps.executeQuery();
        
   
        List<Fabricante> Lista = new ArrayList<>();
        while(rs.next()){
            Fabricante fabricante = new Fabricante();
            
            fabricante.setFacnpj(rs.getString("Facnpj"));
            fabricante.setFanome(rs.getString("Fanome"));
            
            Lista.add(fabricante);
            
            
        }
        
        FabricaConexao.FecharConexao();
        return Lista;

            
        }
        
        public Fabricante Buscar(String id) throws SQLException{
            
        Conecta=FabricaConexao.Conectar();
        Comando="select * from Fabricante where Facnpj ="+id+";";
        //"select * from Zona where Zonome like ?"
        ps=Conecta.prepareStatement(Comando);
        //ps.setString(1,nome+"%"); 
        rs=ps.executeQuery();
        
        Fabricante fabricante = new Fabricante();
        //List<Zona> Lista = new ArrayList<>();
        while(rs.next()){
            
            
            fabricante.setFacnpj(rs.getString("Facnpj"));
            fabricante.setFanome(rs.getString("Fanome"));
            

            
         //   Lista.add(fabricante);
            
            
        }
        
        FabricaConexao.FecharConexao();
        return fabricante;

            
        }
}
