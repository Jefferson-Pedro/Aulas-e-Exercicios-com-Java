package aula12polimorfismoSopreposição;
/**
 *
 * @author jpedro SOBREPOSIÇÃO
 */
public class Aula12Polimorfismo {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        Canguru c = new Canguru();
        Cachorro ch = new Cachorro();
        Cobra cb = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish g = new GoldFish();
        Arara ar = new Arara();
        
        c.locomover();
        ch.locomover();
        ch.emitirSom();
        cb.especieDeCobra();
    }
    
}
