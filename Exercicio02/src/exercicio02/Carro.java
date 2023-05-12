/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio02;

/**
 *
 * @author Mauri
 */
public class Carro extends Veiculo{
    
    private int numeroPortas;

    public Carro(int numeroPortas, String marca, String modelo, int ano) {
        super(marca, modelo, ano);
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    @Override
    public double calcularVelocidadeMaxima() {
        return 200.0;
    }

    public String exibirDetalhes() {
        return "Carro{" + super.exibirDetalhes()+ " numeroPortas=" + numeroPortas + '}';
    }
    
    
}
