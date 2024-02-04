public class Zoo {
  Animal[] animals;
    String name;
   String city;
   int nbrCages;
    public Zoo() {

        animals = new Animal[nbrCages];

        this.name = name;

        this.city = city;

        this.nbrCages = nbrCages;

    }
    public void displayZoo() {
        System.out.println("Détails du zoo " + name + " à " + city + ":");
        System.out.println("Nom du zoo: " + name);
        System.out.println("Ville: " + city);
        System.out.println("Nombre de cages: " + nbrCages);

}
