/*
 * Gets e Sets para a tabela livros
 */
package beans;

/**
 *
 * @author richa
 */
public class Livros {
    
    private int idLivros;
    private String nomeLivro;
    private String editoraLivro;
    private String autorLivro;
    private String quantLivro;
    private String precoLivro;
    private String categoriaLivro;

    public int getIdLivros() {
        return idLivros;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public String getEditoraLivro() {
        return editoraLivro;
    }

    public String getAutorLivro() {
        return autorLivro;
    }

    public String getQuantLivro() {
        return quantLivro;
    }

    public String getPrecoLivro() {
        return precoLivro;
    }

    public String getCategoriaLivro() {
        return categoriaLivro;
    }

    public void setIdLivros(int idLivros) {
        this.idLivros = idLivros;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public void setEditoraLivro(String editoraLivro) {
        this.editoraLivro = editoraLivro;
    }

    public void setAutorLivro(String autorLivro) {
        this.autorLivro = autorLivro;
    }

    public void setQuantLivro(String quantLivro) {
        this.quantLivro = quantLivro;
    }

    public void setPrecoLivro(String precoLivro) {
        this.precoLivro = precoLivro;
    }

    public void setCategoriaLivro(String categoriaLivro) {
        this.categoriaLivro = categoriaLivro;
    }
    
    
}
