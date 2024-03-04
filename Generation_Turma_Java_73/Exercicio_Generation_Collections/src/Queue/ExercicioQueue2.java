package Queue;

import java.util.Stack;

import javax.swing.JOptionPane;

/*Escreva um programa Java contendo uma Collection Stack (Pilha) de Objetos da Classe String, para organizar a retirada de livros em uma pilha. 
 * O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
1: Adicionar um novo livro na pilha. Deve solicitar o nome do livro.
2: Listar todos os livros da Pilha
3: Retirar um livro da pilha 
0: O programa deve ser finalizado. 
Caso a pilha esteja vazia e o atendente tente retirar um livro da pilha, ele deverá informar que a pilha está vazia.
*/

public class ExercicioQueue2 {
	public static void main(String[] args) {
		Stack<String> livros = new Stack<String>();
		
		String nome;
		int num = Integer.parseInt(JOptionPane.showInputDialog(
			    "Escolha uma opção:\n" + 
			    "1- Adicionar um novo livro na pilha.\n" +
			    "2- Listar todos os livros da Pilha.\n" +
			    "3- Retirar um livro da pilha.\n" + 
			    "0- Finalizar programa. "
			));
		
		while(num != 0) {
			
			switch (num) {
			case 1: {
				nome = JOptionPane.showInputDialog("Insira o nome do Livro");
				livros.add(nome);
				JOptionPane.showMessageDialog(null, "Livro adicionado com sucesso!");
				break;
			}
			case 2: {
				if (!livros.isEmpty()) {
					System.out.println("Livros cadastrados: ");
					for (String livro : livros) {
						System.out.println(livro);
					}
				} else {
					JOptionPane.showMessageDialog(null, "A pilha está vazia", "Erro", JOptionPane.ERROR_MESSAGE);
				}
				break;
			}
			case 3: {
				if (!livros.isEmpty()) {
					livros.pop();
					JOptionPane.showMessageDialog(null, "Livro retirado com sucesso!");
					System.out.println("Livros atualmente cadastrados: ");
					for (String livro : livros) {
						System.out.println(livro);
					}
				} else {
					JOptionPane.showMessageDialog(null, "A pilha está vazia", "Erro", JOptionPane.ERROR_MESSAGE);
				}
				break;
			}
			default:
				JOptionPane.showMessageDialog(null, "Escolha um valor válido entre 0 e 3", "Erro", JOptionPane.ERROR_MESSAGE);
				break;
			}
			
			num = Integer.parseInt(JOptionPane.showInputDialog(
				    "Escolha uma opção:\n" + 
				    "1- Adicionar um novo livro na pilha.\n" +
				    "2- Listar todos os livros da Pilha.\n" +
				    "3- Retirar um livro da pilha.\n" + 
				    "0- Finalizar programa. "
				));
			
		}
		
		JOptionPane.showMessageDialog(null, "Programa encerrado! Obrigado e volte sempre.");
	}
}
