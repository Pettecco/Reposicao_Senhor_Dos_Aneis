package org.example;

public class Mago extends Habitante {

    private String cor;

    public Mago(String nome, int idade, float energia, TerraMedia terraMedia, String cor) {
        super(nome, idade, energia, terraMedia);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public void atacar() {
        System.out.println("Mago da cor " + this.cor + " atacando!");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Informações do Mago:");
        System.out.println("Id: " + contador);
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Energia: " + this.energia);
        System.out.println("Cor: " + this.cor);
    }
}
