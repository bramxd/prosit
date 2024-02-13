package tn.esprit.gestionzoo.entities;

public class Animal {

    String family, name;
    private int age;
    boolean isMammal;


    public Animal() {

    }

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.isMammal = isMammal;
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("L'âge de l'animal ne peut pas être négatif.");
        }
    }
    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entities.Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
}