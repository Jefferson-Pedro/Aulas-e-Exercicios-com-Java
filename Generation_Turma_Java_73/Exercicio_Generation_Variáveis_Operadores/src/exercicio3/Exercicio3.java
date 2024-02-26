package exercicio3;

import javax.swing.*;

import static java.lang.Double.parseDouble;

public class Exercicio3 {
    public static void main(String[] args) {

        System.out.println("============== EXERCICIO 3 ==============");
        String msg;

        msg  = JOptionPane.showInputDialog("Digite o salário:");
        double salario = parseDouble(msg);

        msg  = JOptionPane.showInputDialog("Digite o adicional noturno:");
        double adicionalNoturno = parseDouble(msg);

        msg  = JOptionPane.showInputDialog("Digite as horas extras:");
        double horaExtra = parseDouble(msg);

        msg  = JOptionPane.showInputDialog("Digite o desconto:");
        double desconto = parseDouble(msg);

        double salarioLiquido = (salario + adicionalNoturno + (horaExtra*5)) - desconto;

        JOptionPane.showMessageDialog(null, String.format("Seu salário: R$ %.2f", salarioLiquido),
                "Salário Liquido", JOptionPane.INFORMATION_MESSAGE);
    }
}
