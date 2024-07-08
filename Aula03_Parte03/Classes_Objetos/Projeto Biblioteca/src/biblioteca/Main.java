/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author geanm
 */
public class Main {
    public static void main(String[] args) {
        
        Usuarios usuario[] = new Usuarios[2];
        usuario[0] = new Usuarios();
        usuario[0].setNome("Tadeu");
        usuario[0].setIdade(14);
        usuario[0].setSexo("Masculino");
        usuario[0].setTelefone(11100001);
        
        usuario[1] = new Usuarios();
        usuario[1].setNome("Paula");
        usuario[1].setIdade(18);
        usuario[1].setSexo("Feminino");
        usuario[1].setTelefone(99992222);
        
        Livros livro[] = new Livros[2];
        livro[0] = new Livros();
        livro[0].setTitulo("O Pequeno Príncipe");
        livro[0].setAno(1943);
        livro[0].setEdicao(4);
        livro[0].setArea("Infantil");
        livro[0].setAutores("Antoine de Saint-Exupéry");
        livro[0].setEditora("HarperCollins");
        livro[0].setNumeroDeFolhas(96);
        
        livro[1] = new Livros();
        livro[1].setTitulo("Biblioteca da Meia-Noite");
        livro[1].setAno(2020);
        livro[1].setEdicao(2);
        livro[1].setArea("Adolescentes");
        livro[1].setAutores("Matt Haig");
        livro[1].setEditora("Canongate Books");
        livro[1].setNumeroDeFolhas(366);
        
        
        Emprestimo empr = new Emprestimo();
        
        empr.setUsuario(usuario[0]);
        empr.setLivro(livro[1]);
        empr.setDataDoEmprestimo("08/07/2024");
        empr.imprimirEmprestimo();
        empr.getLivro().abrirLivro();
        empr.getUsuario().lerLivro();
        empr.getLivro().fecharLivro();
        empr.devolverLivro();
        
    }
    
}
