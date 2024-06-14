/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hora;

/**
 *
 * @author geanm
 */
public class Hora {
    private int hora;
    private int minuto;
    private int segundo;
    
    public Hora() {
    
    }
    
    public Hora(int h, int m, int s) {
       hora = h;
       minuto = m;
       segundo = s;
       
    }
    
    public Hora(int h){
       setHorario(h, 0, 0);
    }
    
    
    public void setHorario(int h, int m, int s) { }
    public void setHora(int h) { 
        
    
    }
    public void setMinutos(int m) { }
    public void setSegundos(int s) { }
    
    public String getHorario() {
        return hora + ':' + minuto + ':' + segundo;
        
