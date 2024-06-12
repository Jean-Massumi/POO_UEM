/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package equacao2grau;

import java.util.Scanner;

/**
 *
 * @author geanm
 */
public class Equacao2Grau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a, b, c, delta, x1, x2;
        
        Scanner leitura = new Scanner(System.in);
        
        System.out.println("Equação do Segundo Grau");
        System.out.println(" ");

        System.out.print("Informe o valor de a: ");
        a = leitura.nextDouble();
        
        System.out.print("Informe o valor de b: ");
        b = leitura.nextDouble();
        
        System.out.print("Informe o valor de c: ");
        c = leitura.nextDouble();
        
        delta = Math.pow(b, 2) - 4*a*c; 
        
        if (a <= 0){
            System.out.printf("O valor de delta é %.2f \n", delta);
            System.out.println("Programa finalizado, pois não existe divisão por 0! ");
        }
        else if (delta < 0){
                System.out.println("Programa finalizado, pois não existe raiz quadrada de número negativo.");
            }
            else if (delta >= 0){
                x1 = ((-b + Math.sqrt(delta))/ (2*a));
                x2 = ((-b - Math.sqrt(delta))/ (2*a));
                
                System.out.printf("Os valores de x1 e x2 é %.2f , %.2f \n", x1, x2);
                
            }
        
        
        
      
    }
    
}
