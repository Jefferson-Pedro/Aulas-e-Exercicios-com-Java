import javax.swing.*;

public class Exercicio3 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
        boolean doador = JOptionPane.showConfirmDialog(null, "É a primeira vez doando?", null, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;

        String mensagem;
        if (idade >= 18 && idade <= 69 && doador){
            mensagem = (String.format("%s está apto para doar sangue!", nome));
        }else{
            mensagem = (String.format("%s não está apto para doar sangue!", nome));
        }
        JOptionPane.showMessageDialog(null, mensagem, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
