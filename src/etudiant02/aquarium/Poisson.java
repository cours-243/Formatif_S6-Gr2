package etudiant02.aquarium;

public abstract class Poisson extends AbstractAnimal implements Nageur {

    protected String couleur;

    public Poisson(String nom, int age, String couleur) {
        super(nom, age);
        this.couleur = couleur;
    }

    @Override
    public void seDeplacer() {
        nager();
    }

    @Override
    public void nager() {
        System.out.println(nom + " nage dans l'eau.");
    }

    public abstract void manger();
}