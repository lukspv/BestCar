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
public class CarroDao {
    
    
    private String Comando;//comando sql
    private PreparedStatement ps;//preparando o ambiente para o comando sql (intermediario)
    private ResultSet rs;// armazenar os dados do banco da aplicação (apenas nas consultas)
    private Connection Conecta;
    
    
    
    //metodos
    
    public void Cadastrar(Modelo modelo) throws SQLException{
        
        Conecta=FabricaConexao.Conectar();
        Comando="insert into modelo(Modesc,Mofacnpj) values (?,?)";
        ps=Conecta.prepareStatement(Comando);
       
        ps.setString(1,modelo.getmodesc());
        ps.setString(2,modelo.getfabricante().getfacnpj());
        ps.execute();
        
        FabricaConexao.FecharConexao();
      
        
    }
    
    public void Alterar(Modelo modelo) throws SQLException{
        
        Conecta=FabricaConexao.Conectar();
        Comando="update modelo set Modesc = ?, Mofacnpj = ? where Moid= ?;";
        ps=Conecta.prepareStatement(Comando);
        ps.setString(1, modelo.getmodesc());
        ps.setString(2, modelo.getfabricante().getfacnpj());
        ps.setInt(3,modelo.getmoid());
        
        ps.execute();
        
        FabricaConexao.FecharConexao();
        
        
        
        
    }
    
        public void Excluir(int id) throws SQLException{
        
        Conecta=FabricaConexao.Conectar();
        Comando="delete from Modelo where Moid=?;";
        ps=Conecta.prepareStatement(Comando);
        ps.setInt(1,id);
        ps.execute();
        
        FabricaConexao.FecharConexao();
        }
        
        
        public List<Modelo> ListarTodos(String nome) throws SQLException{
            
        Conecta=FabricaConexao.Conectar();
        Comando="select * from Modelo\n" +
                 "join Fabricante on Facnpj=Mofacnpj where Modesc like ? \n" +
                 "limit 5";
        ps=Conecta.prepareStatement(Comando);
        ps.setString(1,nome+"%"); 
        rs=ps.executeQuery();
        List<Modelo> Lista = new ArrayList<>();
        while(rs.next()){
            Modelo modelo = new Modelo();
            
            modelo.setmoid(rs.getInt("Moid"));
            modelo.setmodesc(rs.getString("Modesc"));
            
            Fabricante fabricante = new Fabricante();
            
            fabricante.setfacnpj(rs.getString("Facnpj"));
            fabricante.setfanome(rs.getString("Fanome"));
            
            modelo.setfabricante(fabricante);
            
            Lista.add(modelo);
        }
        FabricaConexao.FecharConexao();
        return Lista;

            
        }
        
        public Carro Buscar(String placa) throws SQLException{
            
        Conecta=FabricaConexao.Conectar();
        Comando="select * from carro where caplaca = ? ";
        ps=Conecta.prepareStatement(Comando);
        ps.setString(1, placa);
        rs=ps.executeQuery();
        Carro carro = null;
        
        if(rs.next()){
            carro = new Carro();
            carro.setcaplaca(rs.getString("Caplaca"));
            carro.setcavldiaria(rs.getDouble("Cavldiaria"));
        }
        FabricaConexao.FecharConexao();
        return carro;   
        }
    
}
