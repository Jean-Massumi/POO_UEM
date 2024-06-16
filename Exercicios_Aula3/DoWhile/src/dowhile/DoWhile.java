/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dowhile;

import java.util.Scanner;

/**
 *
 * @author geanm
 */
public class DoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        int  opcao ;
        double valor1, valor2, resultado;
        
        do {
            System.out.println("**************************");
            System.out.println("[0] Sair");
            System.out.println("[1] Somar");
            System.out.println("[2] Subtrair");
            System.out.println("[3] Multiplicar");
            System.out.println("[4] Dividir");
            System.out.println("**************************");
            System.out.print("[?] Opção: ");
            opcao = leia.nextInt();
            
            switch (opcao){
                case 0:
                    System.out.println("Programa Finalizado!");
                    break;
                case 1, 2, 3, 4:
                    System.out.print("Informe o 1 valor: ");
                    valor1 = leia.nextDouble();
                    System.out.print("Informe o 2 valor: ");
                    valor2 = leia.nextDouble();
                    
                    if (opcao == 1){
                        resultado = valor1 + valor2;
                        System.out.printf("A soma de %.2f + %.2f é igual a %.2f \n", valor1, valor2, resultado);
                    }
                    else if (opcao == 2){
                        resultado = valor1 - valor2;
                        System.out.printf("A subtração de %.2f - %.2f é igual a %.2f \n", valor1, valor2, resultado);
                    }
                    else if (opcao == 3){
                        resultado = valor1 * valor2;
                        System.out.printf("A multiplicação de %.2f x %.2f é igual a %.2f \n", valor1, valor2, resultado);
                    }
                    else if (opcao == 4){
                        resultado = valor1 / valor2;
                        System.out.printf("A divisão de %.2f / %.2f é igual a %.2f \n", valor1, valor2, resultado);
                    }
                    break;

                default:
                    System.out.println("Opção não encontrada!");
                    System.out.println("Programa Finalizado!");
                    
            }
            
        } while ((opcao != 0) && (opcao <= 4));      
       
    }
    
}
