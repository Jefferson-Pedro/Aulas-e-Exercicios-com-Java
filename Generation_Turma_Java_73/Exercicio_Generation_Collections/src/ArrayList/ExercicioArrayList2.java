package ArrayList;

import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

/*Escreva um programa Java para criar uma Collection ArrayList de Objetos da Classe Wrapper Integer, 
 * inicializada com 10 valores inteiros. O programa deverá solicitar ao usuário, que ele digite via 
 * teclado 1 número inteiro e caso ele seja encontrado no ArrayList, exiba na tela a posição deste número
 *  na Collection. Caso o número não seja encontrado, ele deverá exibir na tela a mensagem: O número NN não foi encontrado!
 */

public class ExercicioArrayList2 {
	public static void main(String[] args) {
		  List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		  int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		  
		  
		  if(numeros.contains(num)) {
			  System.out.println("O número "+ num + " está localizado na posição:" + numeros.indexOf(num));
		  }else {
			  System.out.println("O numero " + num + " não foi encontrado!");
		  }
	}

}
