/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 *
 * @author geanm
 */
public class Mamifero extends Animal {
    // Atríbutos
    private int velocidade;

    // CONSTRUCTOR
    public Mamifero(){
        
    }
    
    public Mamifero(int velocidade, String nome, String classe) {
        super(nome, classe);
        this.velocidade = velocidade;
    }
    
    // MÉTODO
    public void correr(){
        System.out.println("Correndo " + velocidade + " vezes");
    }
    
}
