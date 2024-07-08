/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca2;

/**
 *
 * @author geanm
 */
public class ChefeDepartamento extends Funcionario{
    // ATRÍBUTOS
    private String departamento;
    private String dataPromocao;
    private double gratificacao;
    
    public ChefeDepartamento(){
        
    }
    
    // CONSTRUCTOR 
    public ChefeDepartamento(String departamento, String dataPromocao, double gratificacao, String matricula, String dataAdmissao, double salary, String name, String cpf, String dataNascimento) {
        super(matricula, dataAdmissao, salary, name, cpf, dataNascimento);
        this.departamento = departamento;
        this.dataPromocao = dataPromocao;
        this.gratificacao = gratificacao;
    }   
    
    
    // MÉTODOS ACESSORES
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDataPromocao() {
        return dataPromocao;
    }

    public void setDataPromocao(String dataPromocao) {
        this.dataPromocao = dataPromocao;
    }

    public double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(double gratificacao) {
        this.gratificacao = gratificacao;
    }
    
    // MÉTODOS 
    public void mostrarChefe(){
        System.out.println("Name: " + this.getName());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Nascimento: " + this.getDataNascimento());
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Admissao: " + dataAdmissao);
        System.out.println("Salario: " + salary);
        System.out.println("Departamento: " + departamento);
        System.out.println("Data da promoção: " + dataPromocao);
        System.out.println("Gratificação: " + gratificacao);
    }
    
    
}
