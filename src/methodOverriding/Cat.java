package methodOverriding;

public class Cat extends Animal{

    String breed;
    boolean isDomestic;



    public void sleep(){
        System.out.println("Cat is sleeping on the couch");
    }

    public void hunt(){
        System.out.println("Cat is hunting at night time");
    }

    public void makeNoise(){

        System.out.println("Cat is meowing");
    }

    public void eat(){
        System.out.println("Cat is eating a mouse");
    }

    public void consume(){
        super.eat();
        this.eat();

        System.out.println("age");

    }



    public String returnInfo() {
        return
                super.returnInfo() +
                " breed='" + breed + '\'' +
                ", isDomestic=" + isDomestic
                ;
    }






}
