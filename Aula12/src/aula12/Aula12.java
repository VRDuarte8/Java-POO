package aula12;

public class Aula12 {
    public static void main(String[] args) {
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish g = new GoldFish();
        Arara a = new Arara();
        
        System.out.println("### CANGURU ###");
        c.locomover();
        c.alimentar();
        c.emitirSom();
        System.out.println("-------------------");
        
        System.out.println("### CACHORRO ###");
        k.locomover();
        k.alimentar();
        k.emitirSom();
        System.out.println("-------------------");
        
        System.out.println("### COBRA ###");
        j.locomover();
        j.alimentar();
        j.emitirSom();
        System.out.println("-------------------");
        
        System.out.println("### TARTARUGA ###");
        t.locomover();
        t.alimentar();
        t.emitirSom();
        System.out.println("-------------------");
        
        System.out.println("### GOLDFISH ###");
        g.locomover();
        g.alimentar();
        g.emitirSom();
        System.out.println("-------------------");
        
        System.out.println("### ARARA ###");
        a.locomover();
        a.alimentar();
        a.emitirSom();
        System.out.println("-------------------");
    }
    
}
