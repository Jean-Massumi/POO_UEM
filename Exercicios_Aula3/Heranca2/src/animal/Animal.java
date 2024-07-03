/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 *
 * @author geanm
 */
public class Animal {
    // ATRÍBUTOS
    private String nome;
    protected String classe;
    
    // CONSTRUCTOR
    public Animal(){
        
    }
    
    public Animal(String nome, String classe) {
        this.nome = nome;
        this.classe = classe;
    }
       
    
    // MÉTODOS
    public void imprime(){
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
    }
    public void falar(){
        System.out.println("");
    }
    
    
    // MÉTODOS ACESSORES
    public String getNome(){
        return this.nome;
    }
    
}
