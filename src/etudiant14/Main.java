package etudiant14;

import etudiant14.aquarium.Aquarium;
import etudiant14.aquarium.Piranha;
import etudiant14.aquarium.Poisson;
import etudiant14.aquarium.PoissonClown;

public class Main {
    public static void main(String[] args) {

        Aquarium aquarium = new Aquarium(10);

        Poisson p1 = new PoissonClown("Momo", 1, "fuchsia");
        Poisson p2 = new Piranha("Oranda", 2, "rouge");

        aquarium.ajouterPoisson(p1);
        aquarium.ajouterPoisson(p2);

        aquarium.afficherPoissons();

        System.out.println("\nLes poissons nagent :");
        aquarium.faireNagerTous();
    }
}
