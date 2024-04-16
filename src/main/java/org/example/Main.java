package org.example;

public class Main {
    public static void main(String[] args) {

        TerraMedia terraMedia = new TerraMedia();
        Elfo legolas = new Elfo("Legolas", 30, 20, terraMedia, "Elfos da Floresta");
        Anao gimli = new Anao("Gimli", 70, 30, terraMedia, 30.5F,"Moria");
        Mago gandalf = new Mago("Gandalf", 300, 80, terraMedia, "Cinza (depois ele vira o Branco)");
        gimli.arma = new Arma("Machado", false);
        
        terraMedia.addHabitante(legolas);
        terraMedia.addHabitante(gimli);
        terraMedia.addHabitante(gandalf);

        legolas.mostrarInfo();
        legolas.viajar();

        gimli.mostrarInfo();
        gimli.atacar();
        gandalf.mostrarInfo();

        terraMedia.listarHabitantes();


    }
}