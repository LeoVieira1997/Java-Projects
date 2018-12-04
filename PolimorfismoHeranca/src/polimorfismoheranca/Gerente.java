package polimorfismoheranca;
public class Gerente extends Funcionario{
    private int senha;
    private int numeroDeFuncionariosGerenciados;
    
    public boolean autentica(int senha){
        if(this.senha == senha){
            System.out.println("Acesso permitido!");
            return true;
        }else{
            System.out.println("Acesso negado!");
            return false;
        }
    }
    
    @Override
    public double getBonificacao(){
        return super.getBonificacao() + 1000;
    }
    

    public int getSenha() {
        return this.senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getNumeroDeFuncionariosGerenciados() {
        return this.numeroDeFuncionariosGerenciados;
    }

    public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
        this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
    }
    
    
}
