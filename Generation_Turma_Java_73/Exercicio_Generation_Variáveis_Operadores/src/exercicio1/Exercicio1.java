package exercicio1;

import javax.swing.*;
import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("============== EXERCICIO 1 ==============");

        String salarioStr  = JOptionPane.showInputDialog("Digite o salário:");
        double salario = parseDouble(salarioStr);
        String abonoStr  = JOptionPane.showInputDialog("Digite o abono:");
        double abono = parseDouble(abonoStr);
        double novoSalario = salario + abono;

        JOptionPane.showMessageDialog(null, String.format("Seu novo salário: R$ %.2f", novoSalario),
                "Novo Salário", JOptionPane.INFORMATION_MESSAGE);
    }

}
