package maioremedia;

import java.util.Scanner;

/**
 * @author JeffersonPedro
 * 
 * Maior e Média: Faça um programa que leia 5 números e informe 
 * o maior número e a média desses números.
 */
public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
  // MINHA SOLUÇÃO - FICOU IGUAL AO DO PROFESSOR
  
        int num, soma = 0, media, maior = 0,  c = 0;
        
        do{
            System.out.print("Informe o número: ");
            num = ler.nextInt();
            if(num > maior) maior = num;
            soma += num;
            c++;
           
        }while(c < 5);
            media = soma / c;
            System.out.println("O maior numero é: " + maior);
            System.out.println("A média dos numeros informados é: " + media);
    }
    
    
}
