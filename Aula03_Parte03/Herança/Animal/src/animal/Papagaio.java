/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 *
 * @author geanm
 */
public class Papagaio extends Ave{
    // ATRÍBUTOS
    private String vocabulario;

    // CONSTRUCTOR
    public Papagaio(){
        
    }
    
    public Papagaio(String nome, String classe) {
        super(nome, classe);
    }
   
    // MÉTODOS
    public void falar(){
        System.out.println(vocabulario);
    }
    
    // MÉTODOS ACESSORES
    public void setVocabulario(String vocabulario){
        this.vocabulario = vocabulario;
    }
    
    
}
