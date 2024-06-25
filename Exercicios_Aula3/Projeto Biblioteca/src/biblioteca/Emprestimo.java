/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author geanm
 */
public class Emprestimo {
    private String dataDoEmprestimo;
    private String horaDoEmprestimo;
  
    private Livros livro;
    private Usuarios usuario;
    
    public void setLivros(Livros livro){
        this.livro = livro;
    }
    
    public Livros livro(){
        return livro;
    }
    
    public void realizarEmprestimo(){
        boolean emprestimo = true;
        
    }
    
    public void imprimirEmprestimo(){
        
    }
    
}
