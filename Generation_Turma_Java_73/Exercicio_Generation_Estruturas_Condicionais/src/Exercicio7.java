import javax.swing.*;

public class Exercicio7 {
    public static void main(String[] args) {
        int resultado;
        String mensagem;

        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º numero"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º numero"));
        int escolha = Integer.parseInt(JOptionPane.showInputDialog(
                "Escolha uma operação:\n\n" +

                "1: +\n" +
                "2: -\n" +
                "3: /\n" +
                "4: *\n"
        ));

        while (escolha < 0 || escolha > 4){
            JOptionPane.showMessageDialog(null, "Você digitou o cod incorreto. Tente novamente", "Erro", JOptionPane.ERROR_MESSAGE);
            escolha = Integer.parseInt(JOptionPane.showInputDialog(
                    "Escolha uma operação:\n\n" +

                            "1- +\n" +
                            "2- -\n" +
                            "3- /\n" +
                            "4- *\n"
            ));
        }

        switch (escolha){
            case 1:
                resultado = n1 + n2;
                mensagem = (String.format("Resultado da Operação: %d + %d = %d", n1,n2,resultado));
                JOptionPane.showMessageDialog(null, mensagem, "Resultado", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                resultado = n1 - n2;
                mensagem = (String.format("Resultado da Operação: %d - %d = %d", n1,n2,resultado));
                JOptionPane.showMessageDialog(null, mensagem, "Resultado", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 3:
                resultado = n1 / n2;
                mensagem = (String.format("Resultado da Operação: %d / %d = %d", n1,n2,resultado));
                JOptionPane.showMessageDialog(null, mensagem, "Resultado", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 4:
                resultado = n1 * n2;
                mensagem = (String.format("Resultado da Operação: %d / %d = %d", n1,n2,resultado));
                JOptionPane.showMessageDialog(null, mensagem, "Resultado", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
    }
}
