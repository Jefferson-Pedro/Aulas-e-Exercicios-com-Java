/*Escreva um algoritmo em Java, que leia 3 palavras (String),
que definem as características de um tipo de animal possível
segundo o diagrama abaixo, que deve ser lido da esquerda para a direita.
 */

import javax.swing.*;

public class Exercicio4 {
    public static void main(String[] args) {
        String a = null, b = null, c = null;

        //TRATANDO O PRIMEIRO GRUPO (VERTEBRADOS)

        a = JOptionPane.showInputDialog("É Vertebrado ou Invertebrado?: ");

        if (a.equalsIgnoreCase("Vertebrado")) {
            b = JOptionPane.showInputDialog("Ave ou Mamífero? ");

            if (b.equalsIgnoreCase("Ave")) {
                c = JOptionPane.showInputDialog("Carnivoro ou Onivoro?");

                if (c.equalsIgnoreCase("Onivoro")) {
                    JOptionPane.showMessageDialog(null, "Pomba", "Resultado",JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Águia", "Resultado",JOptionPane.INFORMATION_MESSAGE);
                }

            } else if(b.equalsIgnoreCase("Mamifero")) {
                c = JOptionPane.showInputDialog("Onivoro ou Herbivoro?");

                if (c.equalsIgnoreCase("Onivoro")) {
                    JOptionPane.showMessageDialog(null, "Homem", "Resultado",JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Vaca", "Resultado",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }else if (!(a.equalsIgnoreCase("Vertebrado"))){
            b = JOptionPane.showInputDialog("Inseto ou Anelideo? ");

            if (b.equalsIgnoreCase("Inseto")) {
                c = JOptionPane.showInputDialog("Hematofago ou Herbivoro?");

                if (c.equalsIgnoreCase("Herbivoro")) {
                    JOptionPane.showMessageDialog(null, "Lagarta", "Resultado",JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Pulga", "Resultado",JOptionPane.INFORMATION_MESSAGE);
                }

            } else if(b.equalsIgnoreCase("Anelideo")) {
                c = JOptionPane.showInputDialog("Onivoro ou Hematofago?");

                if (c.equalsIgnoreCase("Onivoro")) {
                    JOptionPane.showMessageDialog(null, "Minhoca", "Resultado",JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Sanguessuga", "Resultado",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
    }
}
