/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consultorio;

/**
 *
 * @author geanm
 */
public class Paciente {
    // ATRÍBUTOS
    protected String nomeCompleto;
    protected int idade;
    protected String sexo;
    protected String dataDeNascimento;
    protected String endereco;
    protected String contato;
    protected String tipoDeConvenio;
    
    
    // MÉTODOS ESPECIAIS(ACESSORES)
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getTipoDeConvenio() {
        return tipoDeConvenio;
    }

    public void setTipoDeConvenio(String tipoDeConvenio) {
        this.tipoDeConvenio = tipoDeConvenio;
    }
    
    
    
    
}
