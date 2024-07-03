/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 *
 * @author geanm
 */
public class Vaca extends Mamifero{
    // ATRÍBUTOS
    private boolean permiteOrdenha;

    // CONSTRUCTOR
    public Vaca(){
        
    }
    
    public Vaca(boolean permiteOrdenha, int velocidade, String nome, String classe) {
        super(velocidade, nome, classe);
        this.permiteOrdenha = permiteOrdenha;
    }
    
    
    // MÉTODOS
    public void ordenhar(){
        if (permiteOrdenha){
            System.out.println("Ordenhando!");
        }        
    }

    public void falar(){
        System.out.println("MUUU");
    }
    
}
