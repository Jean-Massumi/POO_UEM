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

    // MÉTODOS ACESSORES
    public String getDataDoEmprestimo() {
        return dataDoEmprestimo;
    }

    public void setDataDoEmprestimo(String dataDoEmprestimo) {
        this.dataDoEmprestimo = dataDoEmprestimo;
    }

    public String getHoraDoEmprestimo() {
        return horaDoEmprestimo;
    }

    public void setHoraDoEmprestimo(String horaDoEmprestimo) {
        this.horaDoEmprestimo = horaDoEmprestimo;
    }

    public Livros getLivro() {
        return livro;
    }

    public void setLivro(Livros livro) {
        this.livro = livro;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }
    
    

    // MÉTODOS
    public void realizarEmprestimo(){
        this.livro.setEmprestimo(true);
        
    }
    
    public void devolverLivro(){
        this.livro.setEmprestimo(false);
        System.out.println("LIVRO DEVOLVIDO");
    }
    
    
    public void imprimirEmprestimo(){
        System.out.println("-------EMPRÉSTIMO-------");
        System.out.println("LIVRO: " + this.livro.getTitulo());        
        System.out.println("USUÁRIO: "+ this.usuario.getNome());        
        System.out.println("DATA: "+ this.dataDoEmprestimo);       
    }
    
}
