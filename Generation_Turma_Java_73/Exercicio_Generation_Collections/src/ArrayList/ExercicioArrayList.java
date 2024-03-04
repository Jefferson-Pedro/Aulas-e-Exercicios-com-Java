package ArrayList;

/*Escreva um programa Java para criar uma Collection ArrayList de Objetos da Classe String. 
O programa deverá solicitar ao usuário, que ele digite via teclado 5 cores e deverá adicioná-las 
individualmente no ArrayList. Em seguida, faça o que se pede:
Mostre na tela todas as cores que foram adicionadas. 
Mostre na tela todas as cores que foram adicionadas ordenadas em ordem crescente.
 */

import java.util.ArrayList;

import javax.swing.JOptionPane;

import java.util.*;


public class ExercicioArrayList {
    public static void main(String[] args) {
        List<String> cores = new ArrayList<String>();
        String cor;
        int cont = 0;

        //Adiciona uma cor
       while (cont < 5) {
          cor = JOptionPane.showInputDialog("Digite uma cor: ");
          cores.add(cor);
          cont ++;
       }

       //Lista não ordenada
       System.out.println("Elementos não ordenados: ");
       for (String elementos : cores) {
        System.out.println(elementos);
       }

       //Ordenando a lista
       Collections.sort(cores);

       System.out.println("Elementos ordenados: ");
       for (String elementos : cores) {
        System.out.println(elementos);
       }
    }

}
