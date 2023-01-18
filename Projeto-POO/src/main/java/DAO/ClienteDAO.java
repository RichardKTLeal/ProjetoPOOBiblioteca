package DAO;

import beans.Cliente;
import com.mycompany.projeto.poo.ConexaoSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
    private ConexaoSQL conexao;
    private Connection conn;
    
    public ClienteDAO() throws SQLException{
        this.conexao = new ConexaoSQL();
        this.conn = this.conexao.startConexao();
    }
    
    public void inserirCliente(Cliente cliente){
           String sql = "INSERT INTO cliente(nomeCliente, emailCliente, telefoneCliente, cpfCliente)VALUES" + "(?,?,?,?)";
           try{
                PreparedStatement stmt = this.conn.prepareStatement(sql);
                stmt.setString(1,cliente.getNomeCliente());
                stmt.setString(2, cliente.getEmailCliente());
                stmt.setString(3, cliente.getTelefoneCliente());
                stmt.setString(4, cliente.getcpfCliente());
                stmt.execute();
                System.out.println("Realizado A Inserção");
           }
           catch(SQLException e){
               System.out.println("Erros ao inserir cliente: " + e.getMessage());
           }
    }
    
    
    public Cliente BuscarCliente(int id){
        String sql = "SELECT * FROM cliente WHERE idCliente = ?";
        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            Cliente cli = new Cliente();
            
            rs.first();
            cli.setidCliente(id);
            cli.setNomeCliente(rs.getString("nomeCliente"));
            cli.setTelefoneCliente(rs.getString("telefoneCliente"));
            cli.setEmailCliente(rs.getString("emailCliente"));
            cli.setcpfCliente(rs.getString("cpfCliente"));
            return cli;
        }
        catch(SQLException e){
            return null;
        }
        
    }
    
    
    public void editarCliente(Cliente cliente){
        String sql = "UPDATE cliente SET nomeCliente=?, emailCliente=?, telefoneCliente=?, cpfCliente=? WHERE idCliente=?";
        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1,cliente.getNomeCliente());
            stmt.setString(2, cliente.getEmailCliente());
            stmt.setString(3, cliente.getTelefoneCliente());
            stmt.setString(4, cliente.getcpfCliente());
            stmt.setInt(5, cliente.getidCliente());
            stmt.execute();
        }catch(SQLException e){
            System.out.println("Erro ao Editar o cliente: " + e.getMessage());
        }
    }
    
    
    public void ExcluirCliente(int id){
        String sql = "DELETE FROM cliente WHERE idCliente = ?";
        try{
        PreparedStatement stmt = this.conn.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.execute();
        System.out.println("Excluido com sucesso");
        }
        catch(SQLException e){
            System.err.println("Erro ao excluir cliente: " + e.getMessage());
        }
    }
    
    
    public List<Cliente> allCliente(){
    
        String sql = "SELECT * FROM cliente";
        try{
           PreparedStatement stmt = this.conn.prepareStatement(sql);
           ResultSet rs = stmt.executeQuery();
           List<Cliente> listadecliente = new ArrayList<>();
           while(rs.next()){
               Cliente cli = new Cliente();
            cli.setidCliente(rs.getInt("idCliente"));
            cli.setNomeCliente(rs.getString("nomeCliente"));
            cli.setTelefoneCliente(rs.getString("telefoneCliente"));
            cli.setEmailCliente(rs.getString("emailCliente"));
            cli.setcpfCliente(rs.getString("cpfCliente"));
            listadecliente.add(cli);
           }
           return listadecliente;
        }
        
        catch(SQLException e){
            return null;
        }
    }
}
