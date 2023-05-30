package aula05;

public class Aula05 {
    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco();
        ContaBanco c2 = new ContaBanco();
        
        c1.abrirConta("CC");
        System.out.println(c1.getSaldo());
        c1.depositar(200);
        System.out.println(c1.getSaldo());
        c1.sacar(20000);
        c1.sacar(100);
        c1.pagarMensal();
        c1.fecharConta();
        c1.sacar(c1.getSaldo());
        c1.fecharConta();
        c1.depositar(20);
        System.out.println("");
        
        c2.abrirConta("CP");
        System.out.println(c2.getSaldo());
        c2.pagarMensal();
        c2.sacar(c2.getSaldo());
        c2.fecharConta();
    }
    
}
