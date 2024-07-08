/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author geanm
 */
public class ControleRemoto {
    private Brinquedo brinquedo;
    
    // CONSTRUCTOR
    public ControleRemoto(Brinquedo b){
        this.brinquedo = b;
    }
    
    public ControleRemoto(){
        
    }
    
    public void mover(){
        brinquedo.mover();
    }
    
}
