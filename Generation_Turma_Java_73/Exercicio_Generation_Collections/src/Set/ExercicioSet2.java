package Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JOptionPane;

/*Escreva um programa Java para criar uma Collection Set de Objetos da Classe Wrapper Integer, inicializada com 10 valores inteiros. 
 * O programa deverá solicitar ao usuário, que ele digite via teclado 1 número inteiro e caso ele seja encontrado no Set, 
 * exiba na tela a mensagem: Número 00 Encontrado! Caso o número não seja encontrado, ele deverá exibir na tela a mensagem: O número NN não foi encontrado!
 */


public class ExercicioSet2 {
	public static void main(String[] args) {
		
		Set<Integer> numeros = Set.of(2,5,1,3,4,9,7,8,10,6);
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		
		if(numeros.contains(num)) {
			System.out.println("Número " + num + " encontrado!");
		}else {
			System.out.println("Número " + num + " não encontrado!");
		}
		
	}

}
