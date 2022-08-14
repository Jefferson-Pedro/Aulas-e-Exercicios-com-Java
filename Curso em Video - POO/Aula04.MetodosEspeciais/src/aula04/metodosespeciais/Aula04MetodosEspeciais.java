package aula04.metodosespeciais;

public class Aula04MetodosEspeciais {

    public static void main(String[] args) {
       Caneta c1 = new Caneta("Compacto", "Preta", 0.4f);
       c1.status();
       
    }
    
}
       /*c1.setModelo("BIC"); // Com metodo set, consigo fazer mudança num private.
       //c1.modelo = "BIC";
       
       c1.setPonta(0.5f);
       //c1.ponta = 0.5f;
       
       c1.status();
       
        //System.out.println("Tenho uma caneta " + c1.modelo);
        System.out.println("Tenho uma caneta " + c1.getModelo());//Permite acessar o modelo com get; */