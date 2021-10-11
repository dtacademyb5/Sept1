package methodOverriding;

public class AnimalTester {


    public static void main(String[] args) {


        Cat c = new Cat();

        c.makeNoise();
        c.eat();
        c.sleep();
        c.hunt();

        SiameseCat siameseCat = new SiameseCat();

        siameseCat.makeNoise();


//        System.out.println( siameseCat.hibernate());

        Animal animal = new Animal();

        animal.makeNoise();


        Cat cat2 = new Cat();

        cat2.makeNoise();

        cat2.consume();

        System.out.println(cat2.returnInfo());




    }
}
