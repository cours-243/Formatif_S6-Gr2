package etudiant01.aquarium;

public class Piranha extends Poisson {

    public Piranha(String nom, int age, String couleur) {
        super(nom, age, couleur);
    }

    @Override
    public void manger() {
        System.out.println(nom + " mange des poissons!");
    }
}
