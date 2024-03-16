package br.com.generation.conta;

import java.util.Scanner;

import br.com.generation.controller.ContaController;
import br.com.generation.model.ContaCorrente;
import br.com.generation.model.ContaPoupanca;
import br.com.generation.util.Cores;

import javax.swing.*;

public class Menu {
	public static void main(String[] args) {

		ContaController controller = new ContaController();
		Scanner leia = new Scanner(System.in);
				
				int opcao;

				while (true) {

					opcao = Integer.parseInt(JOptionPane.showInputDialog(
							 "*****************************************************\n\n" +
									" BANCO DO BRAZIL COM Z \n\n" +
							 "*****************************************************\n\n" +
									" 1 - Criar Conta \n" +
									" 2 - Listar todas as Contas \n" +
									" 3 - Buscar Conta por Numero \n" +
									" 4 - Atualizar Dados da Conta \n" +
									" 5 - Apagar Conta \n" +
									" 6 - Sacar \n" +
									" 7 - Depositar \n" +
									" 8 - Transferir valores entre Contas \n" +
									" 9 - Sair \n\n"
					));

					System.out.println(opcao);

					if (opcao == 9) {
						System.out.println(Cores.TEXT_WHITE_BOLD + "\nBanco do Brazil com Z - O seu Futuro começa aqui!");
						sobre();
						System.exit(0);
					}

					switch (opcao) {
					case 1:
						System.out.println(Cores.TEXT_WHITE + "Criar Conta\n\n");
						controller.cadastrar();
						break;
					case 2:
						System.out.println(Cores.TEXT_WHITE + "Listar todas as Contas\n\n");
						controller.listarTodas();
						break;
					case 3:
						System.out.println(Cores.TEXT_WHITE + "Consultar dados da Conta - por número\n\n");
						controller.procurarPorNumero();
						break;
					case 4:
						System.out.println(Cores.TEXT_WHITE + "Atualizar dados da Conta\n\n");
						controller.atualizar();
						break;
					case 5:
						System.out.println(Cores.TEXT_WHITE + "Apagar a Conta\n\n");
						controller.deletar();
						break;
					case 6:
						System.out.println(Cores.TEXT_WHITE + "Saque\n\n");
						controller.sacar();
						break;
					case 7:
						System.out.println(Cores.TEXT_WHITE + "Depósito\n\n");
						controller.depositar();
						break;
					case 8:
						System.out.println(Cores.TEXT_WHITE + "Transferência entre Contas\n\n");
						controller.transferir();
						break;
					default:
						System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
						break;
					}
				}
			}

			public static void sobre() {
				System.out.println("\n*********************************************************");
				System.out.println("Projeto Desenvolvido por: Jefferson Pedro");
				System.out.println("Generation Brasil - generation@generation.org");
				System.out.println("github.com/Jefferson-Pedro");
				System.out.println("*********************************************************");
			}
	}
