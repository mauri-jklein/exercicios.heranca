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
public class Exercicio02 {

    public static void main(String[] args) {
        // TODO code application logic here
        Veiculo veiculo1 = new Carro(5, "VW", "Gol", 2022);
        Veiculo veiculo2 = new Moto(true, "Honda", "CG125", 2022);
        
        System.out.println(veiculo1.exibirDetalhes());
        System.out.println(veiculo2.exibirDetalhes());
        
        
    }
    
}
