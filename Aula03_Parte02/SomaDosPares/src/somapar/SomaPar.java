/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package somapar;

import java.util.Scanner;

/**
 *
 * @author geanm
 */
public class SomaPar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor, total = 0, troca = 2; 
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        valor = leia.nextInt();
        
        if (valor < 0){
            troca = valor;
            valor = 2;
        }
        
        for (int i = troca; i <= valor; i++){
            if (i % 2 == 0){
                total += i;
            }
        }
        System.out.println("A soma de todos os numeros pares de 2 até "+ valor +" é "+ total);
        
    }
    
}
