/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio02;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Mauri
 */
public class Exercicio02 {

    public static void main(String[] args) {
        // TODO code application logic here
        Veiculo veiculo1 = new Carro(5, "VW", "Gol", 2022);
        Veiculo veiculo2 = new Carro(5, "VW", "Gol", 2022);
        Veiculo veiculo3 = new Carro(5, "VW", "Gol", 2022);
        Veiculo veiculo4 = new Carro(5, "VW", "Gol", 2022);
        Veiculo veiculo5 = new Carro(5, "VW", "Gol", 2022);
        Veiculo veiculo6 = new Moto(true, "Honda", "CG125", 2022);
        Veiculo veiculo7 = new Moto(true, "Honda", "CG125", 2022);
        Veiculo veiculo8 = new Moto(true, "Honda", "CG125", 2022);
        Veiculo veiculo9 = new Moto(true, "Honda", "CG125", 2022);
        Veiculo veiculo10 = new Moto(true, "Honda", "CG125", 2022);
        
        List<Veiculo> veiculos = Arrays.asList(veiculo1, veiculo2, veiculo3, veiculo4, veiculo5, veiculo6, veiculo7, veiculo8, veiculo9, veiculo10);
        
        veiculos.stream().forEach(v ->{
            System.out.println(v.exibirDetalhes());
        });
        
    }
    
}
