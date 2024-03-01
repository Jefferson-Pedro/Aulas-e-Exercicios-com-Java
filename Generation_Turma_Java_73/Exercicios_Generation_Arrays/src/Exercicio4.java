/*
Elabore um algoritmo que leia as notas de uma classe com 10 participantes durante 4 bimestres
 de um ano. As 4 notas de cada participante serão armazenadas em uma linha de uma matriz de
 números reais, logo cada linha da matriz serão as notas de um participante. Em um vetor de
 números reais, armazene as médias de cada participante e exiba as médias de cada um na tela.
 */
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double[][] matriz = new double[3][4];
        double[] media = new double[3];

        //Lendo notas e armazenando na matriz
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 4; c++) {
                System.out.print(String.format("Digite a %dº nota: ", c + 1));
                matriz[l][c] = ler.nextDouble();

            }
            System.out.println("=====================");
        }

        //Apresentando a matriz
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 4; c++) {
                System.out.print("[" + matriz[l][c] + "]");
            }
            System.out.println();
        }

        //Media da matriz
        for (int l = 0; l < 3; l++) {
            double soma = 0; // Reinicializa a soma para cada aluno
            for (int c = 0; c < 4; c++) {
                soma += matriz[l][c];
            }
           media[l] = soma / 4;
        }

        System.out.println("Média dos alunos: ");
        for (int i = 0; i < 3; i++){
            System.out.println(" " + media[i]);
        }
    }
}

