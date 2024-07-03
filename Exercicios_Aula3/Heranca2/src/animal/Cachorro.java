/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 *
 * @author geanm
 */
public class Cachorro extends Mamifero{
    // ATRÍBUTOS
    private boolean tipoLatido;   

    // CONSTRUCTOR
    public Cachorro(){
        
    }


    public Cachorro(boolean tipoLatido, int velocidade, String nome, String classe) {
        super(velocidade, nome, classe);
        this.tipoLatido = tipoLatido;
    }    

    
    // MÉTODO
    public void falar(){
        if (tipoLatido){
            setLateAlto();
        } else {
            setLateBaixo();
        }
    }

    // MÉTODO ACESSORES
    public void setLateAlto(){
        System.out.println("AU, AU");
    }
    
    public void setLateBaixo(){
        System.out.println("au, au");
    }
    
    
    
}
