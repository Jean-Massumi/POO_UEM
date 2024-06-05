/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hora;

/**
 *
 * @author geanm
 */
public class Aplicacao {
    
    public static void main(String[] args) {
        Hora horaDoAlmoco;
        Hora horaAtual = new Hora();
        
        horaDoAlmoco = new Hora();
        
        horaDoAlmoco.setHorario(12,30,00);
        
        Hora horaAtual = new Hora(12,30,00)
                
        System.out.println(horaDoAlmoco.getHora());
        System.out.println(horaAtual.getHorario());
    }
    
}
