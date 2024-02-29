import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = "S";
        Integer idade = 0, genero = 0, tipoDesenvolvedor = 0, numeroDesenvolvedorasBackend = 0,
                mulheresCisTrasFrontEnd = 0, homensCisTransMobileMaiorDe40Anos = 0, naoBinariosFullStackMenor30Anos = 0,
                totalPesquisa = 0, somaIdades = 0;

        while (continuar.equals("S")) {

            System.out.print("Idade: ");
            idade = scanner.nextInt();
            somaIdades += idade;

            System.out.print("Identidade de Gênero: ");
            genero = scanner.nextInt();
            System.out.print("Pessoa Desenvolvedora: ");
            tipoDesenvolvedor = scanner.nextInt();

            if (tipoDesenvolvedor == 1) {
                numeroDesenvolvedorasBackend++;
            } else if ((genero == 1 || genero == 4) && tipoDesenvolvedor == 2) {
                mulheresCisTrasFrontEnd++;
            } else if ((genero == 2 || genero == 5) && tipoDesenvolvedor == 3 && idade > 40) {
                homensCisTransMobileMaiorDe40Anos++;
            } else if (genero == 3 && tipoDesenvolvedor == 4 && idade < 30) {
                naoBinariosFullStackMenor30Anos++;
            }

            System.out.print("\nDeseja continuar (S/N): ");
            scanner.nextLine();
            continuar = scanner.nextLine().toUpperCase();
            totalPesquisa++;

        }

        Float mediaIdadePesquisa = (float) somaIdades / totalPesquisa;

        System.out.printf("""

				Total de pessoas desenvolvedoras Backend: %d

				Total de Mulheres Cis e Trans desenvolvedoras Frontend: %d

				Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: %d

				Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: %d

				O número total de pessoas que responderam à pesquisa: %d

				A média de idade das pessoas que responderam à pesquisa: %.2f
				""", numeroDesenvolvedorasBackend, mulheresCisTrasFrontEnd, homensCisTransMobileMaiorDe40Anos,
                naoBinariosFullStackMenor30Anos, totalPesquisa, mediaIdadePesquisa);
        scanner.close();
    }

}