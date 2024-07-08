/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author geanm
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Brinquedo brin = new Brinquedo();
        Aviao av = new Aviao();
        Carro car = new Carro();
        Barco bar = new Barco();
        
        brin.mover();
        av.mover();
        car.mover();
        bar.mover();
        
        ControleRemoto con = new ControleRemoto(car);
        con.mover();
        
        
    }
    
}
