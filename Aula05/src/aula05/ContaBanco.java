package aula05;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public ContaBanco(){
        this.status = false;
        this.saldo = 0;
    }
    
    public void abrirConta(String t){
        this.setStatus(true);
        this.setTipo(t);
        if (t == "CC"){
            this.setSaldo(50);
            System.out.println("Conta corrente criada, foram adicionados "
                    + "R$50,00.");
        } else if (t == "CP"){
            this.setSaldo(150);
            System.out.println("Conta poupança criada, foram adicionados "
                    + "R$150,00.");
        }
    }
    
    public void fecharConta(){
        if (this.saldo > 0) {
            System.out.println("ERRO! Você deve sacar todo o valor depositado "
                    + "antes de fechar sua conta.");
        } else if (this.saldo < 0){
            System.out.println("ERRO! Você deve quitar o valor pendente no "
                    + "seu saldo antes de fechar sua conta.");
        } else {
            this.setStatus(false);
            System.out.println("Sua conta foi fechada.");
        }
    }
    
    public void depositar(float valor){
        if (this.status == false){
            System.out.println("Esta conta está fechada.");
        } else{
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Foram depositados R$" + valor + ". "
                    + "Saldo Atual: " + this.saldo);
        }
    }
    
    public void sacar(float valor){
        if (this.status == false){
            System.out.println("Esta conta está fechada.");
        } else if (this.saldo < valor){
            System.out.println("Saldo insuficiente.");
        } else {
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Foram sacados R$" + valor + ". "
                    + "Saldo Atual: " + this.getSaldo());
        }
    }
    
    public void pagarMensal(){
        float v = 0;
        if (this.tipo == "CC"){
            v = 12;
        } else if (this.tipo == "CP"){
            v = 20;
        }
        if (!this.isStatus()){
            System.out.println("Esta conta está fechada.");
        } else if (this.saldo < v){
            System.out.println("Saldo insuficiente.");
        } else {
            setSaldo(getSaldo() - v);
            System.out.println("Mensalidade de R$" + v + " paga. "
                    + "Saldo Atual: " + this.saldo);
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
