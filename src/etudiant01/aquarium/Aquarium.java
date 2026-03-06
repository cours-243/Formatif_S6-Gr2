package etudiant01.aquarium;
import java.util.ArrayList;
import java.util.List;

public class Aquarium {

    private List<Poisson> poissons = new ArrayList<>();
    private int capaciteMax;

    public Aquarium(int capaciteMax) {
        this.capaciteMax = capaciteMax;
    }

    public void ajouterPoisson(Poisson p) {
        if (poissons.size() < capaciteMax) {
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