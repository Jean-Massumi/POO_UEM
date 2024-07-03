/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca2;

/**
 *
 * @author geanm
 */
public class Funcionario extends Pessoa{
    // ATRÍBUTOS
    protected String matricula;
    protected String dataAdmissao; 
    protected double salary;
    
    public Funcionario(){
        
    }
    
    // CONSTRUCTOR

    public Funcionario(String matricula, String dataAdmissao, double salary, String name, String cpf, String dataNascimento) {
        super(name, cpf, dataNascimento);
        this.matricula = matricula;
        this.dataAdmissao = dataAdmissao;
        this.salary = salary;
    }    
    
    
    // MÉTODOS ACESSORES
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
    
}
