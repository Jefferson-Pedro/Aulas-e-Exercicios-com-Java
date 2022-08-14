package consoantes;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author JeffersonPedro
 * 
 * Faça um Programa que leia um vetor de 6 caracteres, e diga 
 * quantas consoantes foram lidas. Imprima as consoantes.
 */
public class Consoantes {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
             
       
        String [] cons = new String[6];
        int q = 0;
        
        for (int i = 0; i < cons.length; i++) {
            System.out.print("Insira os caracteres: ");
            String letra = ler.next();
            if(!(letra.equalsIgnoreCase("a")| letra.equalsIgnoreCase("e")
              | letra.equalsIgnoreCase("i") | letra.equalsIgnoreCase("o")
              | letra.equalsIgnoreCase("u"))){
                
                    cons[i] = letra;
                    q++;
            }
        }
        for(String consoante : cons){
            if (consoante != null) {
                System.out.print(consoante + " ");
            }
        }
        
        System.out.println("Quantidade de consoantes lidas: " + q);
        
    }
    
}
