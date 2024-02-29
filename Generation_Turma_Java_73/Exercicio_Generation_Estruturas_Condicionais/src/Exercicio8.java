import javax.swing.*;

public class Exercicio8 {
    public static void main(String[] args) {

        double saldo = 1000.00, saque = 0, total;
        double deposito;
        String mensagem = null;

        int escolha = Integer.parseInt(JOptionPane.showInputDialog(
                "Escolha uma operação:\n\n" +

                        "1: Saldo\n" +
                        "2: Saque\n" +
                        "3: Depósito\n"
        ));

        while (escolha < 1 || escolha > 3){
            JOptionPane.showMessageDialog(null, "Você digitou o cod incorreto. Tente novamente", "Erro", JOptionPane.ERROR_MESSAGE);
            escolha = Integer.parseInt(JOptionPane.showInputDialog(
                    "Escolha uma operação:\n\n" +

                            "1: Saldo\n" +
                            "2: Saque\n" +
                            "3: Depósito\n"
            ));
        }

        switch (escolha){
            case 1:
                mensagem = (String.format("Operação - Saldo. \n Saldo Atual: %.2f", saldo));
                JOptionPane.showMessageDialog(null, mensagem, "Operação", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                saque =  Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser sacado"));
                if(saque > saldo){
                    mensagem = (String.format("Operação - Saque. \n Saldo Insuficiente!\n Saldo Atual: %.2f", saldo));
                    JOptionPane.showMessageDialog(null, mensagem, "Operação", JOptionPane.ERROR_MESSAGE);
                }
                total = saldo - saque;
                mensagem = (String.format("Operação - Saque. \n Saldo Atual: %.2f", total));
                JOptionPane.showMessageDialog(null, mensagem, "Operação", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 3:
                deposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser depositado"));
                total = deposito + saldo;
                mensagem = (String.format("Operação - Deposito. \n Novo Saldo Atual: %.2f", total));
                JOptionPane.showMessageDialog(null, mensagem, "Operação", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
    }
}
