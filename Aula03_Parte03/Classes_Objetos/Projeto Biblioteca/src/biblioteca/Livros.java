/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author geanm
 */
public class Livros {
    private String titulo;
    private String autores;
    private String area;
    private String editora;
    private int ano;
    private int edicao;
    private int numeroDeFolhas;
    private boolean emprestimo;

    // CONSTRUCTOR
    public Livros() {
        this.emprestimo = false;
        
    }

    // MÉTODOS ACESSORES
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public int getNumeroDeFolhas() {
        return numeroDeFolhas;
    }

    public void setNumeroDeFolhas(int numeroDeFolhas) {
        this.numeroDeFolhas = numeroDeFolhas;
    }
    
    public boolean getEmprestimo(){
        return emprestimo;
    }
    
    public void setEmprestimo(boolean emprestimo){
        this.emprestimo = emprestimo;
    }
    
    // MÉTODOS
    public void abrirLivro(){
        System.out.println("LIVRO ESTÁ ABERTO PARA LEITURA");
    }
    
    public void fecharLivro(){
        System.out.println("LIVRO ESTÁ FECHADO PARA LEITURA");
    }
    
    
}
