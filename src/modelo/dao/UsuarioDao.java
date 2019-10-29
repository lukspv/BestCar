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
    public void cadastrar(Usuario usuario) throws SQLException {

        Conecta = FabricaConexao.Conectar();
        Comando = "insert into Usuario (Usnome,Uslogin,Ussenha) values (?,?,?);";
        ps = Conecta.prepareStatement(Comando);

        ps.setString(1, usuario.getusnome());
        ps.setString(2, usuario.getuslogin());
        ps.setString(3, usuario.getussenha());
        ps.execute();

        FabricaConexao.FecharConexao();

    }

    public void alterar(Usuario usuario) throws SQLException {

        Conecta = FabricaConexao.Conectar();
        Comando = "update Usuario set uslogin = ?, usnome = ?, ussenha = ? where usid=?;";
        ps = Conecta.prepareStatement(Comando);
        ps.setString(1, usuario.getuslogin());
        ps.setString(2, usuario.getusnome());
        ps.setString(3, usuario.getussenha());
        ps.setInt(4, usuario.getusid());
        ps.execute();

        FabricaConexao.FecharConexao();

    }

    public void excluir(int id) throws SQLException {

        Conecta = FabricaConexao.Conectar();
        Comando = "delete from usuario where usid=?;";
        ps = Conecta.prepareStatement(Comando);
        ps.setInt(1, id);
        ps.execute();

        FabricaConexao.FecharConexao();
    }

    public List<Usuario> listarTodos(String nome) throws SQLException {

        Conecta = FabricaConexao.Conectar();
        Comando = "select * from Usuario where UsLogin '" + nome + "%';";
        //"select * from Zona where Zonome like ?"
        ps = Conecta.prepareStatement(Comando);
        //ps.setString(1,nome+"%"); 
        rs = ps.executeQuery();

        List<Usuario> lista = new ArrayList<>();
        while (rs.next()) {
            Usuario usuario = new Usuario();

            ps.setString(1, usuario.getuslogin());
            ps.setString(2, usuario.getusnome());
            ps.setString(3, usuario.getussenha());
            ps.setInt(4, usuario.getusid());

            lista.add(usuario);

        }

        FabricaConexao.FecharConexao();
        return lista;

    }

    public Usuario buscar(int id) throws SQLException {

        Conecta = FabricaConexao.Conectar();
        Comando = "select * from Usuario where Usid =" + id + ";";
        //"select * from Zona where Zonome like ?"
        ps = Conecta.prepareStatement(Comando);
        //ps.setString(1,nome+"%"); 
        rs = ps.executeQuery();

        Usuario usuario = new Usuario();
        //List<Zona> lista = new ArrayList<>();
        while (rs.next()) {

            usuario.setusid(rs.getInt("Usid"));
            usuario.setusnome(rs.getString("Usnome"));
            usuario.setuslogin(rs.getString("Uslogin"));
            usuario.setussenha(rs.getString("Ussenha"));
            
            //   lista.add(acessorio);
        }

        FabricaConexao.FecharConexao();
        return usuario;

    }

}
