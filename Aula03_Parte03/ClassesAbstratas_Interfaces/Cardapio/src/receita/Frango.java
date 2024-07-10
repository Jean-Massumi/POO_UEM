/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package receita;

/**
 *
 * @author geanm
 */
public class Frango extends Receita implements Cozido, Assado{

    public Frango() {
        super("Salgado");
    }

    // MÉTODOS ABSTRATOS DA CLASSE MAE RECEITA
    @Override
    public String getIngredientes() {
        return "Frango inteiro depenado";
    }

    @Override
    public String getModoDeFazer() {
        return "Colocar o frango intero no forno";
    }

    // MÉTODO DA INTERFACE COZIDO
    @Override
    public void cozinhar() {
    }

    // MÉTODO DA INTERFACE ASSADO
    @Override
    public void assar() {
        System.out.println("Frango assando");
    }
    
}
