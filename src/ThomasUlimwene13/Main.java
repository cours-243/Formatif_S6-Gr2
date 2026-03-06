package ThomasUlimwene13;

import ThomasUlimwene13.aquarium.Aquarium;
import ThomasUlimwene13.aquarium.Piranha;
import ThomasUlimwene13.aquarium.Poisson;
import ThomasUlimwene13.aquarium.PoissonClown;

public class Main {
    public static void main(String[] args) {

        Aquarium aquarium = new Aquarium(5);

        Poisson p1 = new PoissonClown("Nemo", 2, "Rouge");
        Poisson p2 = new Piranha("Terreure", 3, "Verte");

        aquarium.ajouterPoisson(p1);
        aquarium.ajouterPoisson(p2);

        aquarium.afficherPoissons();

        System.out.println("\nLes poissons nagent :");
        aquarium.faireNagerTous();
    }
}
