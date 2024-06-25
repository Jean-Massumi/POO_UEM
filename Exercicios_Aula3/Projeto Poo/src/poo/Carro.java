/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author geanm
 */
public class Carro {
    private String tipo;
    private String cor;
    private String placa;
    private int numPortas;
    
           
    public void setCor(String cor){
        this.cor = cor;        
    }        
            
    public String getCor(){
        return cor;
    }       
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public void setPlaca(String placa){
        this.placa = placa;
    }
    
    public String getPlaca(){
        return placa;
    }
            
    public void setNumPortas(int numPortas){
        this.numPortas = numPortas;
    }
    
    public int getNumPortas(){
        return numPortas;
    }
    
    public Carro(){
    }
    
    public Carro(String tipo, String cor, String placa, int numPortas){
        this.tipo = tipo;
        this.cor = cor;
        this.placa = placa;
        this.numPortas = numPortas;
    }
    
    public void ligar(){
        System.out.println("CARRO LIGADO");
    }
            
    public void desligar(){
        System.out.println("CARRO DESLIGADO");
    }
    
    public void acelerar(){
        System.out.println("CARRO ACELERANDO");
    }
    
    public void frear(){
        System.out.println("CARRO FREANDO");
    }
    
    
    private int cambio;
    
    public void setCambio(int cambio){
        this.cambio = cambio;
    }
    
    public int getCambio(){
        System.out.println("MARCHA " + cambio);
        return cambio;
    }
    
    
}
