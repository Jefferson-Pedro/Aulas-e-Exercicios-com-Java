package exercicio4;

import javax.swing.*;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Double.parseDouble;

public class Exercicio4 {
    public static void main(String[] args) {

        System.out.println("============== EXERCICIO 4 ==============");

        String numeroStr;
        int cont = 1;
        List<Double> valor = new ArrayList<Double>(4);

        while (cont < 5){
            numeroStr  = JOptionPane.showInputDialog( String.format("Digite o %dº valor", cont));
            valor.add(parseDouble(numeroStr));
            cont++;
        }

        double diferenca = (valor.get(0) * valor.get(1)) - (valor.get(2) * valor.get(3));
        JOptionPane.showMessageDialog(null, String.format("A diferença entre os produtos é: %.1f", diferenca),
                "Diferença entre produtos", JOptionPane.INFORMATION_MESSAGE);


    }
}
