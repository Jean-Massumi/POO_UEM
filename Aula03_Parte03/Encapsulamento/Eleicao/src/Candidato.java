/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author geanm
 */
public class Candidato {
    private String nome;
    private int quantidadeDeVoto;
    
    public void acrescentarVoto(String nome){
        this.nome = nome;
        this.quantidadeDeVoto += 1; 
    }
      
//    private void mostrarStatus(){
//        System.out.println("Candidato: "+ this.nome);
//        System.out.println("Quantidade de votos: "+ this.quantidadeDeVoto);
//    }
//        
    
}
