/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio01;

/**
 *
 * @author Mauri
 */
public class Exercicio01 {

    public static void main(String[] args) {
        // TODO code application logic here
        Funcionario funcionario1 = new Professor("Ciência da Computação", "Mauri", 42, 3000);
        Funcionario funcionario2 = new Administrativo("Ciência da Computação", "Keila", 12, 3000);
        
        System.out.println(funcionario1.exibirDetalhes());
        System.out.println(funcionario2.exibirDetalhes());
    }
    
}
