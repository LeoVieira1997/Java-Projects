package contabanco;
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
    public void estadoAtual(){
        System.out.println("------------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
    }
    
    public ContaBanco() {
        this.status = false;
        this.saldo = 0;
    }
    
    public double getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo(){
            return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void abrirConta(String t){
        this.setStatus(true);
        this.setTipo(t);
        
        if(null == this.getTipo()){
            System.out.println("Tipo de conta inválido!");
        }else switch (this.getTipo()) {
            case "cc":
                this.setSaldo(saldo+50);
                break;
            case "cp":
                this.setSaldo(saldo+150);
                break;
            default:
                System.out.println("Tipo de conta inválido!");
                break;
        }
        System.out.println("Conta aberta com sucesso!");
    }
    
    public void fecharConta(){
        if(this.getSaldo()<0){
            System.out.println("Impossível fechar uma conta negativada");
        }else if(this.getSaldo()>0){
            System.out.println("Impossível fechar a conta com saldo positivo");
        }else{
            this.status = false;
            System.out.println("Conta fechada com sucesso!");
        }
    }
    
    public void depositar(double d){
        if(this.isStatus()){
            this.setSaldo(getSaldo() + d);
            System.out.println("Depósito de " + d + " na conta de " + this.getDono());
            System.out.println("Saldo atual: " + this.getSaldo());
        }else{
            System.out.println("Conta inativa");
        }
    }
    
    public void sacar(double d){
        if(this.isStatus()){
            if(this.getSaldo()>=d){
                this.setSaldo(this.getSaldo()-d);
                System.out.println("Saque de " + d + " na conta de " + this.getDono());
                System.out.println("Saldo atual: " + this.getSaldo()); 
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else {
            System.out.println("Conta inativa");
        }
    }
    
    public void pagarMensal(){
        if(this.isStatus()){
            if("cc".equals(this.getTipo())){
                this.setSaldo(this.getSaldo()-12);
            }else{
                this.setSaldo(this.getSaldo()-20);
            }
        }else{
            System.out.println("Conta inativa");
        }    
    }
}
