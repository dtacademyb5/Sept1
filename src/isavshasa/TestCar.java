package isavshasa;

public class TestCar {


    public static void main(String[] args) {

        Engine engine = new Engine("Honda", 2021, "V6");
        Car.Sunroof mistsubishi = new Car.Sunroof("Mistsubishi", "364hdgs", true);

        Car toyota = new Car("Toyota", "Supra", 2021, engine, mistsubishi );
        Car tesla = new Car("Tesla", "Model 3", 2021, new Engine("Tesla", 2020, "Electric"), mistsubishi);

    }
}
