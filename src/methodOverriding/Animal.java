package methodOverriding;

public class Animal {


    String species;
    int age;
    double weight;



    public void eat(){
        System.out.println("Animal is eating");
    }

    public void sleep(){
        System.out.println("Animal is sleeping");
    }

    public void hunt(){
        System.out.println("Animal is hunting");
    }

    public void makeNoise(){
        System.out.println("Animal is making noise");
    }

    private void hibernate(){
        System.out.println("Animal is hibernating");
    }


    public String returnInfo() {
        return
                "species='" + species + '\'' +
                ", age=" + age +
                ", weight=" + weight
                ;
    }
}
