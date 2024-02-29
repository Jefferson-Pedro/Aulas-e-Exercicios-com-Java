/*Faça um algoritmo em Java que leia 3 valores inteiros A, B e C e imprima
na tela se a soma de A + B é maior, menor ou igual a C.*/

import javax.swing.*;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        int a = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo valor: "));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Insira o terceiro valor: "));

        int soma = a + b;
        String mensagem = null;
        if(soma > c ){
            mensagem = (String.format("%d + %d = %d > %d \n", a, b, soma, c) + "A soma de A + B é Maior do que C");
        } else if (soma < c) {
            mensagem = (String.format("%d + %d = %d < %d \n", a, b, soma, c) + "A soma de A + B é Menor do que C");
        }else{
            mensagem = (String.format("%d + %d = %d = %d \n", a, b, soma, c) + "A soma de A + B é Igual do que C");
        }
        JOptionPane.showMessageDialog(null, mensagem, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}


