package julienbrunet.aquarium;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    // la liste de s poissonqui ne doit pas depasser 20
    private List<Poisson> poissons = new ArrayList<>();
    //le max de poissons
    private int capaciteMaximum=20;

    public Aquarium(int capaciteMax) {
        this.capaciteMaximum = capaciteMax;
    }

    public void ajouterPoisson(Poisson p) {
        if (poissons.size() < capaciteMaximum) {
            poissons.add(p);
            System.out.println(p.getNom() + " ajouté à l'aquarium.");
        } else {
            System.out.println("Aquarium plein !");
        }
    }

    public void afficherPoissons() {
        for (Poisson p : poissons) {
            System.out.println(
                    p.getNom() +  " - " +   p.couleur
            );
        }
    }

    public void faireNagerTous() {
        for (Poisson p : poissons) {
            p.nager(); // polymorphisme
            p.manger();
        }
    }
}