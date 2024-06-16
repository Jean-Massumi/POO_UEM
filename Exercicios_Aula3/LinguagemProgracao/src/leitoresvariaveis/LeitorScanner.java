/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leitoresvariaveis;

import java.util.Scanner;

/**
 *
 * @author geanm
 */
public class LeitorScanner {
    
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        
        boolean bool;
        System.out.print("Entre com um valor do tipo boolean: ");
        bool = leitura.nextBoolean();
        System.out.println("Valor do Booleano: "+ bool + "\n");
        
        byte byt;
        System.out.print("Entre com um valor do tipo byge: ");
        byt = leitura.nextByte();
        System.out.println("Valor do Byte: "+ byt +"\n");
        
        short shor;
        System.out.print("Entre com um valor do tipo short: ");
        shor = leitura.nextShort();
        System.out.println("Valor do Short: "+ shor +"\n");
        
        int i;
        System.out.print("Entre com um valor do tipo int: ");
        i = leitura.nextInt();
        System.out.println("Valor do Int: "+ i +"\n");
        
        long lon;
        System.out.print("Entre com um valor do tipo lon: ");
        lon = leitura.nextLong();
        System.out.println("Valor do Long: "+ lon +"\n");
        
        float floa;
        System.out.print("Entre com um valor do tipo float: ");
        floa = leitura.nextFloat();
        System.out.println("Valor do Float: "+ floa +"\n");
        
        double doub;
        System.out.print("Entre com um valor do tipo double: ");
        doub = leitura.nextDouble();
        System.out.println("Valor do Double: "+ doub +"\n");
        
        char ch;
        System.out.print("Entre com um valor do tipo char: ");
        ch = leitura.next().charAt(0);
        System.out.println("Valor do Char: "+ ch +"\n");
        
        String str;
        System.out.print("Entre com um valor do tipo string: ");
        str = leitura.next();
        System.out.println("Valor do String: "+ str +"\n");
        
        String lin;
        System.out.print("Entre com um valor do tipo string: ");
        leitura.nextLine();
        lin = leitura.nextLine();
        System.out.println("Valor do String: "+ lin +"\n");
       
        
    }
    
}
