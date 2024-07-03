/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca2;

/**
 *
 * @author geanm
 */
public class Aluno extends Pessoa{
    // ATRÍBUTOS
    private String Matricula;
    
    public Aluno(){
        
    }

    // CONSTRUCTOR
    public Aluno(String Matricula, String name, String cpf, String dataNascimento) {
        super(name, cpf, dataNascimento);
        this.Matricula = Matricula;
    }
       
    // MÉTODOS ACESSORES
    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }
    
    // MÉTODOS
    public void mostrarAluno(){
        System.out.println("Nome: " + this.getName() +
                            "\nCPF: " + this.getCpf() +
                            "\nNascimneto: " + this.getDataNascimento() +
                            "\nMatricula: " + this.getMatricula());
    }
    
    
}
