package methodOverriding;

public class SiameseCat extends Cat{

       public void makeNoise(){
           System.out.println("Siamese cat is making Siamese cat specific noise");
           super.makeNoise();
       }
}
