/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package validacaonascimento;

import java.util.Scanner;

/**
 *
 * @author geanm
 */
public class ValidacaoNascimento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        int dia, mes, ano;
        String dataNascimento;
        
        System.out.print("Data de nascimento (DD/MM/AAAA): ");
        dataNascimento = leia.next();
        
        dia = Integer.parseInt(dataNascimento.substring(0, 2));
        mes = Integer.parseInt(dataNascimento.substring(3, 5));
        ano = Integer.parseInt(dataNascimento.substring(6, 10));
        
        if ((ano <= 2024)&&((mes > 0)&&(mes <= 12))&&((dia > 0)&&(dia <= 31))){
            System.out.println("DATA VÁLIDA!");
        }
        else {
            System.out.println("DATA INVÁLIDA!");
        }
        
        
    }
    
}
