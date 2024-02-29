import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = 0, somaNumero = 0, soma = 0;

        do {

            System.out.print("Digite um número: ");
            numero = scanner.nextInt();

            if (numero % 3 == 0 && numero != 0) {
                soma += numero;
                somaNumero++;
            }

        } while (!(numero == 0));

        Float media = (float) soma / somaNumero;

        System.out.print("\nA média de todos os números múltiplos de 3 é: " + media);
        scanner.close();
    }
}
