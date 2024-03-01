import java.util.Scanner;

/*Dado um vetor contendo 10 números inteiros não ordenados e não repetidos, construa um algoritmo que consiga pesquisar
 dados no vetor, onde o usuário irá digitar um número e o programa deve exibir na tela a posição deste número no vetor.
 Caso o número não seja encontrado, a mensagem: “Não foi encontrado!” deve ser exibida na tela.
 */

public class Exercicio1 {
    public static void main(String[] args) {

        int vetor[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um número a ser encontrado: ");
        int n = ler.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < vetor.length; i++) {
            if (n == vetor[i]) {
                encontrado = true;
                System.out.println("Valor encontrado!");
                System.out.println("Valor: " + n);
                System.out.println("Posição: " + i);
                break;
            }
        }

        if (!encontrado) { // Se o número não foi encontrado
            System.out.println("Valor não encontrado!");
        }
    }
}
