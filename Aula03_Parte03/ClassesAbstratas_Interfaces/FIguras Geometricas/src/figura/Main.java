/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figura;

/**
 *
 * @author geanm
 */
public class Main {
    public static void main(String[] args) {
        FiguraGeometrica figura = new FiguraGeometrica();
        figura.desenha();
        
        Circulo circulo = new Circulo();
        circulo.desenha();
        
        Quadrado quadrado = new Quadrado();
        quadrado.desenha();
        
        Triangulo triangulo = new Triangulo();
        triangulo.desenha();
        
        TrianguloEquilatero equilatero = new TrianguloEquilatero();
        equilatero.desenha();
        
    }
    
    
    
}
