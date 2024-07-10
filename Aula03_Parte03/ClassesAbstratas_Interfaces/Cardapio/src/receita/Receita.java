/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package receita;

/**
 *
 * @author geanm
 */
public abstract class Receita {
    protected String tipoReceita;
    
    // CONSTRUCTOR
    public Receita(){}
    
    public Receita(String tipoReceita) {
        this.tipoReceita = tipoReceita;
    }
    
    // MÉTODOS ACESSORES
    public String getTipoReceita() {
        return tipoReceita;
    }

    public void setTipoReceita(String tipoReceita) {
        this.tipoReceita = tipoReceita;
    }
        
    
    // MÉTODOS ABSTRATOS
    public abstract String getIngredientes();
    public abstract String getModoDeFazer();
    
}
