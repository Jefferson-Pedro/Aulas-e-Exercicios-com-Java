
package ordeminversa;

import java.util.Scanner;

/**
 * @author JeffersonPedro
 * 
 * Faça um Programa que leia um vetor de 6 números inteiros
 * e mostre-os na ordem inversa.
 */
public class OrdemInversa {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int num [] = new int[6];
                
        int aux [] = new int[6];
        
        
        //          ENTRADA DE DADOS
        for (int i = 0; i < num.length; i++) {
            System.out.print("Digite um valor: ");
            num[i] = ler.nextInt();
            
        }
        
        //          SAIDA DE DADOS 1
        for (int i = 0; i < num.length; i++) {
            System.out.println("valores inclusos no array: " + num[i]);
        }
        
        //          SAIDA DE DADOS 2
        for (int i = (num.length - 1); i >= 0 ; i--) {
          System.out.println("valores inclusos no array ao inverso: " + num[i]);
        }
        
    }
    
}
