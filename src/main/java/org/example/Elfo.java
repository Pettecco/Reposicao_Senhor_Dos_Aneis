package org.example;

public class Elfo extends Habitante {

    private String tribo;

    public Elfo(String nome, int idade, float energia, TerraMedia terraMedia, String tribo) {
        super(nome, idade, energia, terraMedia);
        this.tribo = tribo;
    }

    public String getTribo() {
        return tribo;
    }

    public void viajar(){
        System.out.println("Elfo viajando...");
    }

    @Override
    public void atacar() {
        System.out.println("Elfo da tribo " + this.tribo + " atacando!");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Informações do Elfo:");
        System.out.println("Id: " + contador);
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Energia: " + this.energia);
        System.out.println("Tribo: " + this.tribo);
    }
}
