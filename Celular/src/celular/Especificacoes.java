package celular;

public class Especificacoes {
    private String modelo;
    private String cor;
    private String marca;
    private String os;
    private double screenSize;
    
    
    public Especificacoes(String m, String c, String ma, String o, double s){
        this.setModelo(m);
        this.setCor(c);
        this.setMarca(ma);
        this.setOs(o);
        this.setScreenSize(s);
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public String getCor(){
        return this.cor;
    }
    
    public void setCor(String c){
        this.cor = c;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public void setMarca(String m){
        this.marca = m;
    }
    
    public String getOs(){
        return this.os;
    }
    
    public void setOs(String o){
        this.os = o;
    }
    
    public double getScreenSize(){
        return this.screenSize;
    }
    
    public void setScreenSize(double s){
        this.screenSize = s;
    }
    
    public void status(){
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Sistema Operacional: " + this.getOs());
        System.out.println("Tamanho da Tela: " + this.getScreenSize());
    }
}
