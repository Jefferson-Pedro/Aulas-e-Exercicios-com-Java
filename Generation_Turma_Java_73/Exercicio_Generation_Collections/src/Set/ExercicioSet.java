package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/*Escreva um programa Java para criar uma Collection Set de Objetos da Classe Wrapper Integer. 
 * O programa deverá solicitar ao usuário, que ele digite via teclado 10 valores inteiros não 
 * repetidos e adicione-os individualmente na Collection Set. Em seguida, faça o que se pede:
Mostre na tela todos os elementos da Collection Set, utilizando a Classe Iterator. 
*/

public class ExercicioSet {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num;
		Set<Integer> numeros = new HashSet<Integer>();
		
		for(int i = 0; i < 10; i ++) {
			System.out.print("Digite um número:");
			num = ler.nextInt();
			numeros.add(num);
		}
		
		Iterator<Integer> iterator = numeros.iterator();
		System.out.println("Listar dados do Set:");
		while(iterator.hasNext()) {
			Integer numero = iterator.next();
			System.out.println(numero);
		}
		
		ler.close();
	}

}
