package pareimpar;

import java.util.Scanner;

/**
 * @author JeffersonPedro
 * 
 * Par e Ímpar: Faça um programa que peça N números inteiros.
 * Calcule e mostre a quantidade de números pares e a quantidade
 * de números impares.
 */
public class ParEImpar {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int num, par = 0, impar = 0;
        String c = "S";
        do{
            System.out.print("Insira um numero: ");
            num = ler.nextInt();
            System.out.println("Deseja continuar? 'S'/'N'");
            c = ler.next().toUpperCase().trim();
            if(c.equals("N")){
                break;
            }else{
                if(num % 2 == 0){
                    par++;
                }else{
                    impar++;
                }
            }
        }while(true);
        
        System.out.println("Numeros pares: " + par);
        System.out.println("Numeros impares: " + impar);
    }  
}
