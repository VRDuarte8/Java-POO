package aula11;

public class Aula11 {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        Aluno a1 = new Aluno();
        Bolsista b1 = new Bolsista();
        Professor p1 = new Professor();
        Tecnico t1 = new Tecnico();
        
        v1.setNome("Matheus");
        v1.setIdade(22);
        v1.setSexo("M");
        
        a1.setNome("Vinicius");
        a1.setIdade(21);
        a1.setSexo("M");
        a1.setMatricula(1234);
        a1.setCurso("Analise e Desenvolvimento de Sistemas");
        
        b1.setNome("Isabella");
        b1.setIdade(18);
        b1.setSexo("F");
        b1.setCurso("Medicina");
        b1.setMatricula(4321);
        b1.setBolsa(6354.15f);
        
        p1.setNome("Aline");
        p1.setIdade(40);
        p1.setSexo("F");
        p1.setSalario(5469.54f);
        p1.setEspecialidade("Matemática");
        p1.receberAumento(500f);
        
        t1.setNome("Ana");
        t1.setIdade(17);
        t1.setSexo("F");
        t1.setMatricula(6546);
        t1.setCurso("Informática");
        t1.setRegistroProfissional(8484);
        
        
        System.out.println(v1.toString());
        System.out.println("");
        
        System.out.println(a1.toString());
        a1.pagarMensalidade();
        System.out.println("");
        
        System.out.println(b1.toString());
        b1.pagarMensalidade();
        System.out.println("");
        
        System.out.println(p1.toString());
        System.out.println("");
        
        System.out.println(t1.toString());
        t1.pagarMensalidade();
        t1.praticar();
    }
    
}
