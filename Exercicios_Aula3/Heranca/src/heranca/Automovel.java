/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author geanm
 */
public class Automovel extends Terrestre{
    // ATRÍBUTOS
    private String numPlaca;
    private int numPortas;
    
    // CONSTRUCTOR
    public Automovel(){
        
    }
        
    // MÉTODOS ESPECIAIS
    public String getNumPlaca() {
        return numPlaca;
    }

    public void setNumPlaca(String numPlaca) {
        this.numPlaca = numPlaca;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }
    
    
    public void imprimeDadosAutomovel(){
        System.out.println("CAPACIDADE: "+ capacidade);
        System.out.println("NUMERO DE RODAS: "+ numRodas);
        
    }
    
            
}
