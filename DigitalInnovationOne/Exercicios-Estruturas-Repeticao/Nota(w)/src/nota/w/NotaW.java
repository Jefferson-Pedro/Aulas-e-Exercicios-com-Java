package nota.w;

import java.util.Scanner;

/**
 * @author JeffersonPedro
 * 
 * Nota: Faça um programa que peça uma nota, entre zero e dez. 
 * Mostre uma mensagem caso o valor seja inválido e continue pedindo
 * até que o usuário informe um valor válido.
 */
public class NotaW {
    public static void main(String[] args) {
        
            Scanner ler = new Scanner(System.in);
            
            System.out.print("Digite um valor entre 0 e 10: ");
            int nota = ler.nextInt();
            
                        
            while(nota < 0 || nota > 10){
                System.out.print("Valor invalido, digite um valor entre"
                        + " 0 e 10: ");
                nota =  ler.nextInt();
            }
        
    }  
}

/*  SOLUÇÃO DO PROFESSOR

while(true){
            System.out.print("Insira o nome do aluno: ");
            nome = ler.next();
            if(nome.equals("0")){
                break;
            }else{
            System.out.print("\nInsira agora,a idade do aluno: ");
            idade = ler.nextInt();
            }
        }
        System.out.print("\nVocê saiu do programa....");*/