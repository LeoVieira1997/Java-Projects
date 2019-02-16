package com.leonardovieira;

public class Generico<E> {

    private E elemento;

    public void setElemento(E elemento){
        this.elemento = elemento;
    }

    public E getElemento(){
        return elemento;
    }


    public static void main(String[] args) {
        Generico<String> g = new Generico<>();
        g.setElemento("abc");
        System.out.println(g.getElemento());
    }
}
