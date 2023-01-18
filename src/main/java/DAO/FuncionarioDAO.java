package DAO;

import beans.Funcionario;
import com.mycompany.projeto.poo.ConexaoSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioDAO {
    private ConexaoSQL conexao;
    private Connection conn;
    
    public FuncionarioDAO() throws SQLException{
        this.conexao = new ConexaoSQL();
        this.conn = this.conexao.startConexao();
    }
    /* metódo de inserção de valores na tabela funcionário
    
    */
    public void inserirFuncionario(Funcionario funcionario){
           String sql = "INSERT INTO funcionario(nomeFuncionario, emailFuncionario, telefoneFuncionario, cpfFuncionario)VALUES" + "(?,?,?,?)";
           try{
                PreparedStatement stmt = this.conn.prepareStatement(sql);
                stmt.setString(1,funcionario.getNomeFuncionario());
                stmt.setString(2, funcionario.getEmailFuncionario());
                stmt.setString(3, funcionario.getTelefoneFuncionario());
                stmt.setString(4, funcionario.getCpfFuncionario());
                stmt.execute();
                System.out.println("Realizado A Inserção");
           }
           catch(SQLException e){
               System.out.println("Erros ao inserir funcionario: " + e.getMessage());
           }
    }
    
    /* Método de busca de valores para a tabela Funcionario
    
    */
    public Funcionario BuscarFuncionario(int id){
        String sql = "SELECT * FROM funcionario WHERE idFuncionario = ?";
        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            Funcionario func = new Funcionario();
            
            rs.first();
            func.setIdFuncionario(id);
            func.setNomeFuncionario(rs.getString("nomeFuncionario"));
            func.setTelefoneFuncionario(rs.getString("telefoneFuncionario"));
            func.setEmailFuncionario(rs.getString("emailFuncionario"));
            func.setCpfFuncionario(rs.getString("cpfFuncionario"));
            return func;
        }
        catch(SQLException e){
            return null;
        }
        
    }
    
    /*  Método de edição de funcionários na tabela funcionários
    
    */
    public void editarFuncionario(Funcionario funcionario){
        String sql = "UPDATE funcionario SET nomeFuncionario=?, emailFuncionario=?, TelefoneFuncionario=?, cpfFuncionario=? WHERE idFuncionario=?";
        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1,funcionario.getNomeFuncionario());
            stmt.setString(2, funcionario.getEmailFuncionario());
            stmt.setString(3, funcionario.getTelefoneFuncionario());
            stmt.setString(4, funcionario.getCpfFuncionario());
            stmt.setInt(5, funcionario.getIdFuncionario());
            stmt.execute();
        }catch(SQLException e){
            System.out.println("Erro ao Editar o Funcionario: " + e.getMessage());
        }
    }
    
    /*  Método de exclusão de funcionários na tabela funcionario
    
    */
    public void ExcluirFuncionario(int id){
        String sql = "DELETE FROM funcionario WHERE idFuncionario = ?";
        try{
        PreparedStatement stmt = this.conn.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.execute();
        System.out.println("Excluido com sucesso");
        }
        catch(SQLException e){
            System.err.println("Erro ao excluir cafe: " + e.getMessage());
        }
    }
    
    
    public List<Funcionario> allFuncionario(){
    
        String sql = "SELECT * FROM funcionario";
        try{
           PreparedStatement stmt = this.conn.prepareStatement(sql);
           ResultSet rs = stmt.executeQuery();
           List<Funcionario> listadefuncionario = new ArrayList<>();
           while(rs.next()){
            Funcionario func = new Funcionario();
            func.setIdFuncionario(rs.getInt("idFuncionario"));
            func.setNomeFuncionario(rs.getString("nomeFuncionario"));
            func.setTelefoneFuncionario(rs.getString("telefoneFuncionario"));
            func.setEmailFuncionario(rs.getString("emailFuncionario"));
            func.setCpfFuncionario(rs.getString("cpfFuncionario"));
            listadefuncionario.add(func);
           }
           return listadefuncionario;
        }
        
        catch(SQLException e){
            return null;
        }
    }
}