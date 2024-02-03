package me.tunisiaa.classi.es3;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Eldis", "Izeirovski", 16, "A123A123");
        Person p2 = new Person("Fabio", "Corona", 16, "1337N1663r");

        Group g = new Group();

        g.addPerson(p1);
        g.addPerson(p2);

        System.out.println(g.toString());
    }



}
