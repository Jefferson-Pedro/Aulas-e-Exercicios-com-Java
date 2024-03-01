/*
Elabore um algoritmo que leia uma Matriz 3x3 de números inteiros e em seguida, mostre na tela:
Todos os elementos da Diagonal Principal
Todos os elementos da Diagonal Secundária
A Soma de todos os elementos da Diagonal Principal
A Soma de todos os elementos da Diagonal Secundária
 */

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int i, j;
        int matriz[][] = new int[3][3];
        int soma = 0;

        //Preenchendo os valores da matriz
        for (int l = 0; l < 3; l++) { // linha
            for (int c = 0; c < 3; c++) { //coluna
                System.out.print("Informe o valor: ");
                matriz[l][c] = ler.nextInt();
            }
        }

        //Apresentando a matriz criada
        System.out.println("\n======= Matriz criada: =======");
        for (int l = 0; l < 3; l++) { // linha
            for (int c = 0; c < 3; c++) { //coluna
                System.out.print("[" + matriz[l][c] + "]");
            }
            System.out.println();
        }

        //Calculos da Matriz Diagonal Principal
        System.out.print("\nElementos da Diagonal Principal: ");
        for (int l = 0; l < 3; l++) { // linha
            for (int c = 0; c < 3; c++) { //coluna
                if (l == c) {
                    soma += matriz[l][c];
                    System.out.print(matriz[l][c] + " ");
                }

            }
        }
        System.out.println("\nSoma da diagonal principal: " + soma);
        soma = 0;

        //Calculos da Matriz Diagonal Secundária
        System.out.print("Elementos da Diagonal Secundária: ");
        for (int l = 0; l < 3; l++) { // linha
            soma += matriz[l][2 - l];
            System.out.print(matriz[l][2 - l] + " ");
        }

        System.out.println("\nSoma da diagonal secundária: "+soma);

        ler.close();

    }
}

