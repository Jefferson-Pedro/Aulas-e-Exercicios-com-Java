/*
Escreva um algoritmo em Java, que leia a idade de várias pessoas (números inteiros), via teclado e mostre na tela o
total de pessoas cuja idade seja menor que 21 anos e o total de pessoas cuja idade seja maior que 50 anos.
A leitura dos dados deve ser finalizada ao digitar uma idade negativa.
 */

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int num = 0, menor = 0, maior = 0;

        while (true){
            System.out.print("Digite uma idade: ");
            num = ler.nextInt();
            if (num < 0) {
                break;
            } else if (num < 21){
                menor++;
            } else if (num > 50) {
                maior++;
            }
        }
        System.out.print(String.format("Total de pessoas menores de 21 anos: %d \n", menor));
        System.out.print(String.format("Total de pessoas maiores de 50 anos: %d", maior));
    }
}
