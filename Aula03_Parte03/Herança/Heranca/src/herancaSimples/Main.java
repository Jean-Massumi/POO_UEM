/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herancaSimples;

/**
 *
 * @author geanm
 */
public class Main {
    public static void main(String[] args) {
        // Main Program
        Automovel carro = new Automovel();
        Automovel moto = new Automovel();
        
        carro.setNumPlaca("GGG-1010");
        carro.setNumPortas(4);
        carro.setCapacidade(5);
        carro.setNumRodas(4);
        
        moto.setNumPlaca("AAA-1111");
        moto.setNumPortas(0);
        moto.setCapacidade(2);
        moto.setNumRodas(2);
        
        carro.imprimeDadosAutomovel();
        moto.imprimeDadosAutomovel();
        
        carro.capacidade = 10;
        carro.numRodas = 4;
        carro.imprimeDadosAutomovel();
        
    }
    
    
}
