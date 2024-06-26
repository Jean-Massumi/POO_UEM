/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author geanm
 */
public class Poo {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        
        meuCarro.setCor("Preto");
        meuCarro.setTipo("Passeio");
        meuCarro.setPlaca("GGG-111");
        meuCarro.setNumPortas(4);
        
        System.out.println("-----CARRO-----");
        System.out.println("Cor: "+ meuCarro.getCor());
        System.out.println("Tipo: "+ meuCarro.getTipo());
        System.out.println("Placa: "+ meuCarro.getPlaca());
        System.out.println("Portas: "+ meuCarro.getNumPortas());
        
        Pessoa minhaPessoa = new Pessoa();
        
        minhaPessoa.setPessoa("João");
        minhaPessoa.setCorDoCabelo("Castanho");
        minhaPessoa.setIdade(32);
        
        System.out.println("-----Pessoa-----");
        System.out.println("Nome: "+ minhaPessoa.getPessoa());
        System.out.println("Cor do Cabelo: "+ minhaPessoa.getCorDoCabelo());
        System.out.println("Idade: "+ minhaPessoa.getIdade());
        
        Carro meuOutroCarro = new Carro("CELTA", "PRETO", "GGG-0000", 4);
        
        System.out.println("-----CARRO2-----");
        System.out.println("Cor: "+ meuOutroCarro.getCor());
        System.out.println("Tipo: "+ meuOutroCarro.getTipo());
        System.out.println("Placa: "+ meuOutroCarro.getPlaca());
        System.out.println("Portas: "+ meuOutroCarro.getNumPortas());
        
        Pessoa minhaOutraPessoa = new Pessoa("Paulo", "Preto", 23);
        
        System.out.println("-----Pessoa2-----");
        System.out.println("Nome: "+ minhaOutraPessoa.getPessoa());
        System.out.println("Cor do Cabelo: "+ minhaOutraPessoa.getCorDoCabelo());
        System.out.println("Idade: "+ minhaOutraPessoa.getIdade());
        
        System.out.println("");
        Pessoa pessoa = new Pessoa();
        pessoa.setCarro(meuCarro);
        
        pessoa.ligarCarro();
        pessoa.setCambioMarcha(1);
        pessoa.getCarro().getCambio();
        pessoa.acelerarCarro();
        
        System.out.println();
        
        pessoa.setCambioMarcha(2);
        pessoa.getCarro().getCambio();
        pessoa.acelerarCarro();
        
        System.out.println();
        
        pessoa.setCambioMarcha(3);
        pessoa.getCarro().getCambio();
        pessoa.acelerarCarro();
        
        System.out.println();
        
        pessoa.setCambioMarcha(2);
        pessoa.getCarro().getCambio();
        pessoa.acelerarCarro();
        
        System.out.println();
        
        pessoa.setCambioMarcha(1);
        pessoa.getCarro().getCambio();
        pessoa.acelerarCarro();
        
        System.out.println();
        
        pessoa.setCambioMarcha(0);
        pessoa.getCarro().getCambio();
        pessoa.frearCarro();
        pessoa.desligarCarro();
    }
    
}
