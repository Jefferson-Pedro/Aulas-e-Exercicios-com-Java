import java.util.Scanner;

/*Escreva um algoritmo em Java, que leia um número inteiro via
teclado e mostre na tela uma mensagem indicando se este número é par ou ímpar
e se o número é positivo ou negativo.
 */

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = ler.nextInt();

        if(num % 2 == 0 && num > 0){
            System.out.printf(String.format("O Número %d é par e positivo!", num));
        } else if (num % 2 == 0 && num < 0) {
            System.out.printf(String.format("O Número %d é par e negativo!", num));
        } else if (!(num % 2 == 0) && num > 0) {
            System.out.printf(String.format("O Número %d é impar e positivo!", num));
        }else{
            System.out.printf(String.format("O Número %d é impar e negativo!", num));
        }
    }
}
