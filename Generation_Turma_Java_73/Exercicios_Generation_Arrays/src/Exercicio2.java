/*
Elabore um algoritmo que leia 10 números inteiros e armazene em um vetor. Em seguida, mostre na tela:
Todos os elementos dos índices ímpares do vetor
Todos os elementos do vetor que são números pares
A Soma de todos os elementos do vetor
A Média de todos os elementos do vetor, armazenada em uma variável do tipo real

 */

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int soma = 0;
        double media;
        int[] vetor = new int[10];

        // Armazena os valores no vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(String.format("Digite o %dº numero: ", i + 1));
            vetor[i] = ler.nextInt();
            soma += vetor[i];
        }

        // Mostra os elementos pares do vetor
        System.out.print("Elementos pares: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.print(vetor[i] + " ");
            }
        }
        System.out.println();

        // Mostra os elementos nos índices ímpares do vetor
        System.out.print("Elementos nos índices ímpares: ");
        for (int i = 1; i < vetor.length; i += 2) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        media = (double) soma / vetor.length;

        // Mostra a soma de todos os elementos do vetor
        System.out.println("A Soma de todos os elementos do vetor: " + soma);

        // Mostra a média de todos os elementos do vetor
        System.out.printf("A Média de todos os elementos do vetor: %.2f\n", media);

        ler.close();
    }
}
