/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package consultasaldo;

import java.util.Scanner;

/**
 *
 * @author geanm
 */
public class ConsultaSaldo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char opcao = 'x';
        double saldo = 0, saque, deposito;
        Scanner leia = new Scanner(System.in);
        
        while (opcao != 'd'){
            
            System.out.println("**************************");
            System.out.println("[a] Consulta Saldo");
            System.out.println("[b] Saque");
            System.out.println("[c] Deposito");
            System.out.println("[d] Sair");
            System.out.println("**************************");
            System.out.print("[?] Opção: ");
            opcao = leia.next().charAt(0);
            
            switch (opcao){
                case 'a':
                    System.out.printf("O seu saldo atual é de R$%.2f \n", saldo);
                    break;
                case 'b':
                    System.out.print("Informe o valor do saque: ");
                    saque = leia.nextDouble();
                    
                    if (saque > saldo){
                        System.out.println("Saldo insuficiente para saque!");
                    }
                    else {
                        saldo -= saque;
                        System.out.println("Saque realizado com sucesso!");
                    }
                    break;
                    
                case 'c':
                    System.out.print("Informe o valor do deposito: ");
                    deposito = leia.nextDouble();
                    saldo += deposito;
                    break;
                    
                case 'd':
                    System.out.println("Programa Finalizado!");
                    break;
                                        
            }
            
        }
        
    }
    
}
