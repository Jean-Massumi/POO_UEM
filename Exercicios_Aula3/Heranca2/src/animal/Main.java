/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 *
 * @author geanm
 */
public class Main {
    public static void main(String[] args) {
        Animal a = new Animal("Jacare", "Anfibio");
        a.imprime();
        a.falar();
        System.out.println(a.getNome());
        
        System.out.println("");
        Ave a1 = new Ave("Aguia", "Voadora");
        a1.imprime();
        a1.falar();
        a1.voar(3);
        
        System.out.println("");
        BemTeVi b = new BemTeVi();
        b.falar();
        
        System.out.println("");
        Papagaio p = new Papagaio();
        p.setVocabulario("Xingamento");
        p.falar();
        
        System.out.println("");
        Mamifero m = new Mamifero(3, "Morcego", "Sanguesuga");
        m.imprime();
        m.falar();
        m.correr();
        
        System.out.println("");
        Vaca v = new Vaca(true, 3, "Cleuza", "Terrestre");
        v.falar();
        v.ordenhar();
        v.correr();
        
        System.out.println("");
        Cachorro c = new Cachorro(true, 7, "bola", "Terrestre");
        c.falar();
        c.imprime();
        
        
        
    }
    
    
    
    
}
