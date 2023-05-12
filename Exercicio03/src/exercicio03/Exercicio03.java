/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;

/**
 *
 * @author Mauri
 */
public class Exercicio03 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Produto produto1 = new Livro("Mauri", "Use a Cabeça", 250.23);
        Produto produto2 = new Livro("Mauri", "Banco de Dados", 250.23);
        Produto produto3 = new Livro("Mauri", "Java e Spring", 250.23);
        Produto produto4 = new Livro("Mauri", "Mongo DB", 250.23);
        Produto produto5 = new Livro("Mauri", "Postgres", 250.23);
        Produto produto6 = new Livro("Mauri", "JPA e Hibernate", 250.23);
        Produto produto7 = new Livro("Mauri", "Kubernetes", 250.23);
        Produto produto8 = new Livro("Mauri", "Docker e Docker Compose", 250.23);
        Produto produto9 = new CD("Zeca Pagodinho", "Vida Boa", 15.23);
        List<Produto> produtos = Arrays.asList(produto1, produto2, produto3, produto4, produto5, produto6, produto7, produto8, produto9);
        
        produtos.stream().forEach(p -> {
            System.out.println(p.exibirDetalhes());
        });
    }
    
}
