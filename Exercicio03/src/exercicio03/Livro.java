package exercicio03;

/**
 *
 * @author Mauri
 */
public class Livro extends Produto {
    
    private String autor;

    public Livro(String autor, String titulo, double preco) {
        super(titulo, preco);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String exibirDetalhes() {
        return "Livro{" + super.exibirDetalhes()+ " autor=" + autor + '}';
    }

    public double calcularDesconto() {
        return super.getPreco()*0.9;
    }
    
    
}
