/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca2;

/**
 *
 * @author geanm
 */
public class Main {
    public static void main(String[] args) {
        ChefeDepartamento chefe = new ChefeDepartamento("DIN", "12/04/2019", 1223, "000-1111", "07/01/2007", 3000, 
        "Pedro da Silva", "000.111.001-11", "10/03/1987");
        
        Aluno aluno = new Aluno("2132-12", "Roberto Gomes", "111.000.111-00", "13/07/2001");
        
        
        
        aluno.mostrarAluno();
        System.out.println("");
        chefe.mostrarChefe();
        
        
    }
    
}
