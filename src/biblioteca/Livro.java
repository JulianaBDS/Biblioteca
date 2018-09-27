
package biblioteca;


public class Livro {
    String categoria;
    String autor;
    int codigo;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Livro{" + "categoria=" + categoria + ", autor=" + autor + ", codigo=" + codigo + '}';
    }
    
    
    
}
