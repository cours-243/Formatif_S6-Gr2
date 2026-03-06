package KangbeniParfaitBomboma;

import KangbeniParfaitBomboma.aquarium.Aquarium;
import KangbeniParfaitBomboma.aquarium.Piranha;
import KangbeniParfaitBomboma.aquarium.Poisson;
import KangbeniParfaitBomboma.aquarium.PoissonClown;

public class Main {
    public static void main(String[] args) {

        Aquarium aquarium = new Aquarium(5);

        Poisson p1 = new PoissonClown("Nemo", 2, "orange");
        Poisson p2 = new Piranha("Terreur", 3, "bleu");

        aquarium.ajouterPoisson(p1);
        aquarium.ajouterPoisson(p2);

        aquarium.afficherPoissons();

        System.out.println("\nLes poissons nagent :");
        aquarium.faireNagerTous();
    }
}
