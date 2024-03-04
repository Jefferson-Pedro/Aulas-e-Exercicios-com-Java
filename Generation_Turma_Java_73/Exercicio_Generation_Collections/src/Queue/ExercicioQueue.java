package Queue;

import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JOptionPane;

/*
 * Escreva um programa Java contendo uma Collection Queue (Fila) de Objetos da Classe String, para organizar a ordem de chegada dos Clientes de um Banco. 
 * O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
		1: Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente.
		2: Listar todos os Clientes na fila
		3: Chamar (retirar) uma pessoa da fila 
		0: O programa deve ser finalizado. 
Caso a fila esteja vazia, o programa deverá informar que a fila está vazia ao tentar retirar (chamar) um cliente da fila..

 */

public class ExercicioQueue {
	public static void main(String[] args) {
		Queue<String> clientes = new LinkedList<String>();
		String nome;
		int num = Integer.parseInt(JOptionPane.showInputDialog(
			    "Escolha uma opção:\n" + 
			    "1- Adicionar um novo Cliente na fila.\n" +
			    "2- Listar todos os Clientes na fila.\n" +
			    "3- Chamar (retirar) uma pessoa da fila.\n" + 
			    "0- Finalizar programa. "
			));

			while (num != 0) {
			    switch (num) {
			        case 1:
			            nome = JOptionPane.showInputDialog("Digite o nome do cliente");
			            clientes.add(nome);
			            JOptionPane.showMessageDialog(null, "Cliente adicionado com sucesso!");
			            break;
			        case 2:
			            System.out.println("Clientes cadastrados:");
			            for (String cliente : clientes) {
			                System.out.println(cliente);
			            }
			            break;
			        case 3:
			            if (!clientes.isEmpty()) {
			                clientes.remove();
			                System.out.println("Clientes ativos no cadastro:");
			                for (String cliente : clientes) {
			                    System.out.println(cliente);
			                }
			            } else {
			                JOptionPane.showMessageDialog(null, "Não há clientes na fila.");
			            }
			            break;
			        default:
			            JOptionPane.showMessageDialog(null, "Opção inválida. Por favor, digite um número entre 0 e 3.");
			            break;
			    }

			    num = Integer.parseInt(JOptionPane.showInputDialog(
			        "Escolha uma opção:\n" + 
			        "1- Adicionar um novo Cliente na fila.\n" +
			        "2- Listar todos os Clientes na fila.\n" +
			        "3- Chamar (retirar) uma pessoa da fila.\n" + 
			        "0- Finalizar programa. "
			    ));
			}

			JOptionPane.showMessageDialog(null, "Programa encerrado!", "Obrigado", JOptionPane.INFORMATION_MESSAGE);

	}
}
