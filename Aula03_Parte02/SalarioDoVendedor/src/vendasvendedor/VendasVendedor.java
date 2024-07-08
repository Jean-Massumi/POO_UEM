/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vendasvendedor;

import java.util.Scanner;

/**
 *
 * @author geanm
 */
public class VendasVendedor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double salario, vendas, comissao, total;
        String nome;
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Digite o nome do vendedor: ");
        nome = leia.next();
        System.out.print("Salário Fixo: ");
        salario = leia.nextDouble();
        System.out.print("Total de Vendas: ");
        vendas = leia.nextDouble();
        
        comissao =  vendas * 15 / 100;
        total = comissao + salario;
                
        System.out.println("\nNome: "+ nome);
        System.out.println("Salário Fixo: "+ String.format("%.2f", salario));
        System.out.println("Comissao de 15% no total de vendas: "+ String.format("%.2f", comissao));
        System.out.println("Salário Final: "+ String.format("%.2f", total));
        
    }
    
}
