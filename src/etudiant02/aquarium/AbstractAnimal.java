package etudiant02.aquarium;

public abstract class AbstractAnimal {

    protected String nom;
    protected int age;

    public AbstractAnimal(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public abstract void seDeplacer();
}
