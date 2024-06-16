/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerospares;

import java.util.Scanner;

/**
 *
 * @author geanm
 */
public class NumerosPares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero, troca = 0 ;
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Informe um numero inteiro: ");
        numero = leia.nextInt();
 
        System.out.println("Todos o numeros pares de "+ numero);
        if (numero <= 0){
            troca = numero;
            numero = 0;
        }
        
        for (int i = troca; i <= numero; i++){
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
        
    }
    
}
