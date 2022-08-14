package NomeEIdade;

import java.util.Scanner;

/**
 * @author JeffersonPedro
 * 
 * Nome e Idade: Faça um programa que leia conjuntos de dois valores, 
 * o primeiro representando a nome do aluno e o segundo representando 
 * a sua idade. (Pare o programa inserindo o valor 0 no campo nome)
 */
public class NomeEIdade {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
         
        
        while(true){
            System.out.print("Insira o nome do Aluno: ");
            String nome = ler.next();   
             if(nome.equals("0")){
                System.out.println("Programa Encerrado!");
                break;               
                       
            }else{
                 System.out.print("Insira a idade do Aluno: ");
                 int idade = ler.nextInt();
                 System.out.println("Nome do Aluno: " + nome);
                 System.out.println("Idade do Aluno: " + idade);
            }  
        }

// SOLUÇÃO DO PROFESSOR
        /* while(true){
             System.out.print("Insira o nome do aluno: ");
             nome = ler.next();
             if(nome.equals("0")){
                 break;
             }else{
             System.out.print("\nInsira agora,a idade do aluno: ");
             idade = ler.nextInt();
             }
         }
         System.out.print("\nVocê saiu do programa....");*/
    } 
}
