package org.example;

public abstract class Habitante {

    static int contador = 0;
    protected int id;
    protected String nome;
    protected int idade;
    protected float energia;
    protected Arma arma; // agregação
    protected TerraMedia terraMedia;
    int cont;

    public Habitante(String nome, int idade, float energia, TerraMedia terraMedia) {
        contador++;
        cont = contador;
        this.id = cont;
        this.nome = nome;
        this.idade = idade;
        this.energia = energia;
        this.terraMedia = terraMedia;
    }

    public void atacar(){}
    public void mostrarInfo(){}

}
