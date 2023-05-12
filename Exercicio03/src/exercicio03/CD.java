package exercicio03;

/**
 *
 * @author Mauri
 */
public class CD extends Produto{
    
    private String artista;

    public CD(String artista, String titulo, double preco) {
        super(titulo, preco);
        this.artista = artista;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String exibirDetalhes() {
        return "CD{" +  super.exibirDetalhes()+ " artista=" + artista + '}';
    }

    @Override
    public double calcularDesconto() {
        return super.getPreco()*0.95;
    }
}
