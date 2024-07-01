/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consultorio;

import java.util.Scanner;

/**
 *
 * @author geanm
 */
public class Secretaria {    
    // ATRÍBUTOS
    public Paciente paciente;
    private Consulta consulta;
    Scanner read = new Scanner(System.in);

    // MÉTODOS
    public void cadastrarPaciente(){
        paciente = new Paciente();
        System.out.print("Nome completo: ");
        this.paciente.nomeCompleto = read.nextLine();
        System.out.print("Idade: ");
        this.paciente.idade = read.nextInt();
        
    }
    
    
    
    
}
