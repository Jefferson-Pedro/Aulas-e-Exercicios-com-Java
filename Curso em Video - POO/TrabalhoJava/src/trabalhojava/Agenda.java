package trabalhojava;

import java.util.Scanner;

public class Agenda {
    
    public String nome;
    private int telefone;
    private String endereco;

    public Agenda() {
        
        this.setNome("Insira o nome");
        this.setTelefone(0000000);
        this.setEndereco("Insira o endereço");
    }
     public void status(){
        System.out.println("-----------------STATUS--------------");
        System.out.println("Nome: " + this.getNome()); 
        System.out.println("Telefone: " + this.getTelefone());
        System.out.println("Endereço: " + this.getEndereco());
        
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void nome(){
        Scanner ler = new Scanner(System.in);
        System.out.print("Insira o nome: ");
        setNome(ler.nextLine());    
    }
    public void endereco(){
        Scanner ler = new Scanner(System.in);
        System.out.print("Insira o endereço: ");
        setEndereco(ler.nextLine());    
    }
    public void telefone(){
        Scanner ler = new Scanner(System.in);
        System.out.print("Insira o telefone: ");
        setTelefone (ler.nextInt());
    }   
}
