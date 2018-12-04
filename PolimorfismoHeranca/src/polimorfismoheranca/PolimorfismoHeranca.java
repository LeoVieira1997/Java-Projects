package polimorfismoheranca;
public class PolimorfismoHeranca {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setSalario(5000);
        System.out.println(gerente.getBonificacao());
    }
    
}
