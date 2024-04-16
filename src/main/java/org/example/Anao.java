package org.example;

public class Anao extends Habitante {
    private float altura;
    private String reino;

    public Anao(String nome, int idade, float energia, TerraMedia terraMedia, float altura, String reino) {
        super(nome, idade, energia, terraMedia);
        this.altura = altura;
        this.reino = reino;
    }

    public float getAltura() {
        return altura;
    }

    public String getReino() {
        return reino;
    }

    @Override
    public void atacar() {
        System.out.println("Anão atacando!! E O MEU MACHADO!!");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Informações do Anao:");
        System.out.println("Id: " + contador);
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Energia: " + this.energia);
        System.out.println("Altura: " + this.altura);
        System.out.println("Reino: " + this.reino);
    }
}
