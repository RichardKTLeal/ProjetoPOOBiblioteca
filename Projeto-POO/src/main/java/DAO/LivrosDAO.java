package DAO;

import beans.Livros;
import com.mycompany.projeto.poo.ConexaoSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LivrosDAO {
    private ConexaoSQL conexao;
    private Connection conn;
    
    public LivrosDAO() throws SQLException{
        this.conexao = new ConexaoSQL();
        this.conn = this.conexao.startConexao();
    }
    
    public void inserirLivros(Livros livros){
           String sql = "INSERT INTO livros(nomeLivro, quantLivro, autorLivro, editoraLivro, precoLivro, categoriaLivro)VALUES" + "(?,?,?,?,?,?)";
           try{
                PreparedStatement stmt = this.conn.prepareStatement(sql);
                stmt.setString(1,livros.getNomeLivro());
                stmt.setString(2,livros.getQuantLivro());
                stmt.setString(3,livros.getAutorLivro());
                stmt.setString(4,livros.getEditoraLivro());
                stmt.setString(5, livros.getPrecoLivro());
                stmt.setString(6,livros.getCategoriaLivro());
                stmt.execute();
                System.out.println("Realizado A Inserção");
           }
           catch(SQLException e){
               System.out.println("Erros ao inserir livro: " + e.getMessage());
           }
    }
    
    
    public Livros BuscarLivros(int id){
        String sql = "SELECT * FROM livros WHERE idLivros = ?";
        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            Livros liv = new Livros();
            
            rs.first();
            liv.setIdLivros(id);
            liv.setNomeLivro(rs.getString("nomeLivro"));
            liv.setQuantLivro(rs.getString("quantLivro"));
            liv.setAutorLivro(rs.getString("autorLivro"));
            liv.setEditoraLivro(rs.getString("editoraLivro"));
            liv.setPrecoLivro(rs.getString("precoLivro"));
            liv.setCategoriaLivro(rs.getString("categoriaLivro"));
            return liv;
        }
        catch(SQLException e){
            return null;
        }
        
    }
    
    
    public void editarLivros(Livros livros){
        String sql = "UPDATE livros SET nomeLivro=?, quantLivro=?, autorLivro=?, editoraLivro=?, precoLivro=?, categoriaLivro=? WHERE idLivros=?";
        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            
            stmt.setString(1,livros.getNomeLivro());
                stmt.setString(2,livros.getQuantLivro());
                stmt.setString(3,livros.getAutorLivro());
                stmt.setString(4,livros.getEditoraLivro());
                stmt.setString(5, livros.getPrecoLivro());
                stmt.setString(6,livros.getCategoriaLivro());
                stmt.setInt(7, livros.getIdLivros());
                stmt.execute();
        }catch(SQLException e){
            System.out.println("Erro ao Editar o livro: " + e.getMessage());
        }
    }
    
    
    public void ExcluirLivros(int id){
        String sql = "DELETE FROM livros WHERE idLivros = ?";
        try{
        PreparedStatement stmt = this.conn.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.execute();
        System.out.println("Excluido com sucesso");
        }
        catch(SQLException e){
            System.err.println("Erro ao excluir livro: " + e.getMessage());
        }
    }
    
    
    public List<Livros> allLivros(){
    
        String sql = "SELECT * FROM livros";
        try{
           PreparedStatement stmt = this.conn.prepareStatement(sql);
           ResultSet rs = stmt.executeQuery();
           List<Livros> listadelivros = new ArrayList<>();
           while(rs.next()){
               Livros liv = new Livros();
            liv.setIdLivros(rs.getInt("idLivros"));
            liv.setNomeLivro(rs.getString("nomeLivro"));
            liv.setQuantLivro(rs.getString("quantLivro"));
            liv.setAutorLivro(rs.getString("autorLivro"));
            liv.setEditoraLivro(rs.getString("editoraLivro"));
            liv.setPrecoLivro(rs.getString("precoLivro"));
            liv.setCategoriaLivro(rs.getString("categoriaLivro"));
            listadelivros.add(liv);
           }
           return listadelivros;
        }
        
        catch(SQLException e){
            return null;
        }
    }
}
