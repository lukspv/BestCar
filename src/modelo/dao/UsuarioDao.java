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
public class UsuarioDao {

    private String Comando;//comando sql
    private PreparedStatement ps;//preparando o ambiente para o comando sql (intermediario)
    private ResultSet rs;// armazenar os dados do banco da aplicação (apenas nas consultas)
    private Connection Conecta;

    //metodos
    public void Cadastrar(Usuario usuario) throws SQLException {

        Conecta = FabricaConexao.Conectar();
        Comando = "insert into Usuario (Usnome,Uslogin,Ussenha) values (?,?,?);";
        ps = Conecta.prepareStatement(Comando);

        ps.setString(1, usuario.getUsnome());
        ps.setString(2, usuario.getUslogin());
        ps.setString(3, usuario.getUssenha());
        ps.execute();

        FabricaConexao.FecharConexao();

    }

    public void Alterar(Usuario usuario) throws SQLException {

        Conecta = FabricaConexao.Conectar();
        Comando = "update Usuario set Uslogin = ?, Usnome = ?, Ussenha = ? where Usid=?;";
        ps = Conecta.prepareStatement(Comando);
        ps.setString(1, usuario.getUslogin());
        ps.setString(2, usuario.getUsnome());
        ps.setString(3, usuario.getUssenha());
        ps.setInt(4, usuario.getUsid());
        ps.execute();

        FabricaConexao.FecharConexao();

    }

    public void Excluir(int id) throws SQLException {

        Conecta = FabricaConexao.Conectar();
        Comando = "delete from Usuario where Usid=?;";
        ps = Conecta.prepareStatement(Comando);
        ps.setInt(1, id);
        ps.execute();

        FabricaConexao.FecharConexao();
    }

    public List<Usuario> ListarTodos(String nome) throws SQLException {

        Conecta = FabricaConexao.Conectar();
        Comando = "select * from Usuario where UsLogin '" + nome + "%';";
        //"select * from Zona where Zonome like ?"
        ps = Conecta.prepareStatement(Comando);
        //ps.setString(1,nome+"%"); 
        rs = ps.executeQuery();

        List<Usuario> Lista = new ArrayList<>();
        while (rs.next()) {
            Usuario usuario = new Usuario();

            ps.setString(1, usuario.getUslogin());
            ps.setString(2, usuario.getUsnome());
            ps.setString(3, usuario.getUssenha());
            ps.setInt(4, usuario.getUsid());

            Lista.add(usuario);

        }

        FabricaConexao.FecharConexao();
        return Lista;

    }

    public Usuario Buscar(int id) throws SQLException {

        Conecta = FabricaConexao.Conectar();
        Comando = "select * from Usuario where Usid =?;";
        //"select * from Zona where Zonome like ?"
        ps = Conecta.prepareStatement(Comando);
        //ps.setString(1,nome+"%"); 
        rs = ps.executeQuery();

        Usuario usuario = new Usuario();
        //List<Zona> Lista = new ArrayList<>();
        while (rs.next()) {

            ps.setString(1, usuario.getUslogin());
            ps.setString(2, usuario.getUsnome());
            ps.setString(3, usuario.getUssenha());
            ps.setInt(4, usuario.getUsid());

            //   Lista.add(acessorio);
        }

        FabricaConexao.FecharConexao();
        return usuario;

    }

}
