/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author geanm
 */
public class Pessoa {
    private String pessoa;
    private String corDoCabelo;
    private int idade;
    
    public void setPessoa(String pessoa){
        this.pessoa = pessoa;
    }
    
    public String getPessoa(){
        return pessoa;
    }

    public String getCorDoCabelo() {
        return corDoCabelo;
    }

    public void setCorDoCabelo(String corDoCabelo) {
        this.corDoCabelo = corDoCabelo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public Pessoa(){    
    }
    
    public Pessoa(String pessoa, String corDoCabelo, int idade){
        this.pessoa = pessoa;
        this.corDoCabelo = corDoCabelo;
        this.idade = idade;
    }
    
    private Carro carro;
    
    public void setCarro(Carro carro){
        this.carro = carro;
    }
    
    public Carro getCarro(){
        return carro;
    }
    
    public void ligarCarro(){
        carro.ligar();
    }
    
    public void desligarCarro(){
        carro.desligar();
    }
    
    public void acelerarCarro(){
        carro.acelerar();
    }
    
    public void frearCarro(){
        carro.frear();
    }
    
    public void setCambioMarcha(int marcha){
        carro.setCambio(marcha);
    }
                                                                
    
}
