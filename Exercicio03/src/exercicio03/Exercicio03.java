/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio03;

/**
 *
 * @author Mauri
 */
public class Exercicio03 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Produto produto1 = new Livro("Mauri", "Use a Cabeça", 250.23);
        Produto produto2 = new CD("Zeca Pagodinho", "Vida Boa", 15.23);
        
        
        
        System.out.println(produto1.exibirDetalhes());
        System.out.println(produto2.exibirDetalhes());
        
    }
    
}
