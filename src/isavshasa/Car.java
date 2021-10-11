package isavshasa;




// IS-A relationship represents inheritance. Car is a vehicle.
// HAS-A relationship represents Aggregation/Composition . Car has an Engine.

import sun.security.provider.Sun;

// HAS-A relationship has 2 kinds:
// Aggregation - > When the class can exist independently from its encompassing class. Car has an Engine.
// Composition ->
public class Car extends Vehicle{

    String make;
    String model;
    int year;
    Engine engine;
    Sunroof sunroof;




    public Car(String make, String model, int year, Engine engine, Sunroof sunroof) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.engine = engine;
        this.sunroof = sunroof;
    }



     static class Sunroof{  // inner class
         String make;
         String model;
         boolean isTinted;

        public Sunroof(String make, String model, boolean isTinted) {
            this.make = make;
            this.model = model;
            this.isTinted = isTinted;
        }
    }

}
