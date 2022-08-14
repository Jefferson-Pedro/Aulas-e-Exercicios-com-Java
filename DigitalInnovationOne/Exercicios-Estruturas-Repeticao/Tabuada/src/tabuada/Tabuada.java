package tabuada;

import java.util.Scanner;

/**
 *@author JeffersonPedro
 * 
 * Tabuada: Desenvolva um gerador de tabuada, capaz de gerar 
 * a tabuada de qualquer número inteiro entre 1 a 10. O usuário
 * deve informar de qual numero ele deseja ver a tabuada. A saída
 * deve ser conforme o exemplo abaixo:

    Tabuada de 5:
    5 X 1 = 5
    5 X 2 = 10
 */
public class Tabuada {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int num;
        System.out.println("Digite o numero da tabuada: ");
        num = ler.nextInt();
        
        for(int i = 1; i <= 10; i++ ){
            System.out.println( num + " X " + i + " = " + num*i);
        }
    }
}
