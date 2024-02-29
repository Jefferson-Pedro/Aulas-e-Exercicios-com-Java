/*Escreva um algoritmo em Java, que leia 10 números inteiros via teclado e mostre na tela quantos números
são pares e quantos número são ímpares.
 */

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int par = 0, impar = 0;

        for (int n = 1; n <=10; n++ ){
            System.out.print(String.format("Digite o %dº número: ", n));
            int num = ler.nextInt();
            if (num % 2 == 0)
                par++;
            else
                impar++;
        }

        System.out.println("Total de números pares: " + par);
        System.out.println("Total de números impares: " + impar);
    }
}
