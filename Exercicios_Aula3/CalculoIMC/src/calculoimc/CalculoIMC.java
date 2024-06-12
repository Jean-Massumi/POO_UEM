/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculoimc;

import java.util.Scanner;

/**
 *
 * @author geanm
 */
public class CalculoIMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double peso, altura, imc;
        
        Scanner leitura = new Scanner(System.in);
        
        System.out.print("Digite o seu peso: ");
        peso = leitura.nextDouble();
        
        System.out.print("Digite a sua altura: ");
        altura = leitura.nextDouble();
        
        imc = peso / (altura * altura);
        System.out.printf("O seu IMC é de %.2f \n", imc);
        
    }
    
}
