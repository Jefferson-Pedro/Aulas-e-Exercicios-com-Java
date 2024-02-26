package exercicio2;

import javax.swing.*;

import static java.lang.Double.parseDouble;

public class Exercicio2 {
    public static void main(String[] args) {

        System.out.println("============== EXERCICIO 2 ==============");

        String notaStr;
        int cont = 1;
        double soma = 0;

        while (cont < 5){
            notaStr  = JOptionPane.showInputDialog( String.format("Digite a %dº nota", cont));
            double nota = parseDouble(notaStr);
            soma += nota;
            cont++;
        }

        double media  = soma / 4;
        JOptionPane.showMessageDialog(null, String.format("Sua média é: %.1f", media),
                "Média", JOptionPane.INFORMATION_MESSAGE);
    }
}
