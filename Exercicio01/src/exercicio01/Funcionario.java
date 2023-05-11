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
public abstract class Funcionario {
    
    private String nome;
    private int idade;
    private double salario;
    
    public abstract double calcularBonusSalario();

    public Funcionario(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String exibirDetalhes() {
        return "Funcionario{" + "nome=" + nome + ", idade=" + idade + ", salario=" + (salario + calcularBonusSalario())+'}';
    }
    
    
    
}
