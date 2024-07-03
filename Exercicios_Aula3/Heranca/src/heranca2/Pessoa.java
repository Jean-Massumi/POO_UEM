/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca2;

/**
 *
 * @author geanm
 */
public class Pessoa {
    // ATRÍBUTOS
    protected String name;
    protected String  cpf;
    protected String dataNascimento;
 
    
    public Pessoa(){
        
    }
    
    // CONSTRUCTOR
    public Pessoa(String name, String cpf, String dataNascimento) {
        this.name = name;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }
    
    
    // MÉTODOS ACESSORES
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    
    
}
