import javax.swing.*;

public class Exercicio6 {
    public static void main(String[] args) {
        String nome, cargo = "", mensagem = "";

        nome = JOptionPane.showInputDialog("Digite o nome do Colaborador");
        int cod = Integer.parseInt(JOptionPane.showInputDialog("Digite o Codigo do Cargo: "));

        while (cod < 1 || cod > 6) {
            JOptionPane.showMessageDialog(null, "Você digitou o código errado. Tente novamente.", "Código errado.", JOptionPane.INFORMATION_MESSAGE);
            cod = Integer.parseInt(JOptionPane.showInputDialog("Digite o Codigo do Cargo: "));
        }

        double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário: "));

        switch (cod) {
            case 1:
                cargo = "Gerente";
                mensagem = String.format("Nome do Colaborador: %s\nCargo: %s\nSalário Reajustado: %.2f", nome, cargo, ((salario * 0.1) + salario));
                break;
            case 2:
                cargo = "Vendedor";
                mensagem = String.format("Nome do Colaborador: %s\nCargo: %s\nSalário Reajustado: %.2f", nome, cargo, ((salario * 0.07) + salario));
                break;
            case 3:
                cargo = "Supervisor";
                mensagem = String.format("Nome do Colaborador: %s\nCargo: %s\nSalário Reajustado: %.2f", nome, cargo, ((salario * 0.09) + salario));
                break;
            case 4:
                cargo = "Motorista";
                mensagem = String.format("Nome do Colaborador: %s\nCargo: %s\nSalário Reajustado: %.2f", nome, cargo, ((salario * 0.06) + salario));
                break;
            case 5:
                cargo = "Estoquista";
                mensagem = String.format("Nome do Colaborador: %s\nCargo: %s\nSalário Reajustado: %.2f", nome, cargo, ((salario * 0.05) + salario));
                break;
            case 6:
                cargo = "Técnico de TI";
                mensagem = String.format("Nome do Colaborador: %s\nCargo: %s\nSalário Reajustado: %.2f", nome, cargo, ((salario * 0.08) + salario));
                break;
        }

        JOptionPane.showMessageDialog(null, mensagem, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
