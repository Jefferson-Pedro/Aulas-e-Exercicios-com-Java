package fatorial;

import java.util.Scanner;

/**
 * @author JeffersonPedro
 * 
 * 🔸Fatorial: Faça um programa que calcule o fatorial de um 
 * número inteiro fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120
 */
public class Fatorial {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
       int num ;int fat = 1;
       
        System.out.print("Insira o número: ");
        num = ler.nextInt();
      
        for (int i = 1; i <= num; i++) {
            fat = fat * i;
        }
        System.out.println("O fatorial de " + num + " é: " + fat);  
    }    
}

/*  SOLUÇÃO DO PROFESSOR:

        num = ler.nextInt();
        for (int i = num; i >= 1; i--) {
            fat = fat * 1;
        }
        System.out.println("O fatorial de " + num + " é: " + fat);

*/