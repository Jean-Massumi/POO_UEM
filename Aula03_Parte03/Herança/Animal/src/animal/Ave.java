/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 *
 * @author geanm
 */
public class Ave extends Animal{
    // CONSTRUCTOR
    public Ave(){
        
    }
    
    public Ave(String nome, String classe) {
        super(nome, classe);
    }

    // MÉTODOS
    public void falar() {
        System.out.println("pii, piu");
    }
    
    public void voar(int n){
        System.out.println("Voando " + n + " vezes");
    }
       
    
}
