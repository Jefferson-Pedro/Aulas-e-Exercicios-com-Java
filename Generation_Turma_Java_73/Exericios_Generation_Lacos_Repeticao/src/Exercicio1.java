/*Escreva um algoritmo em Java, que leia 2 números inteiros via teclado,
onde o primeiro número deve ser menor do que o segundo número. Caso contrário,
deve ser exibida uma mensagem na tela informando que o intervalo é inválido e
sair do programa.No intervalo informado, mostre na tela todes os números que
são múltiplos de 3 e 5.*/

import javax.swing.*;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Insira o primeiro número: ");
        int n1 = ler.nextInt();
        System.out.print("Insira o segundo número: ");
        int n2 = ler.nextInt();
        ler.close();

        if (n1 < n2){
            for (int c = n1; c<= n2; c++  ){
                if(c % 3 == 0 && c % 5 == 0) {
                    System.out.print(String.format("%d é múltiplo de 3 e 5\n", c));
                }
            }
        }else{
            System.out.println("Intervalo invalido!");
        }
   }
}
