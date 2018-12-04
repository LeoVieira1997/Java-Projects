package contabanco;
public class Aula05 {
    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco();
        c1.setNumConta(1111);
        c1.setDono("aaaa");
        c1.abrirConta("cp");
        
        
        ContaBanco c2 = new ContaBanco();
        c2.setNumConta(2222);
        c2.setDono("bbbb");
        c2.abrirConta("cc");
        
        c1.depositar(500);
        c2.depositar(450);
        c2.sacar(50);
        c2.sacar(1000);
        
        c1.estadoAtual();
        c2.estadoAtual();
    }
}
