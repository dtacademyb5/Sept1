package methodOverridingRules;

public class Child extends Parent{

// Annotations are another type in Java like classes. They change the behavior of the item that you put on top[ of.

//    public void m1(){
//
//    }



     int m1(int i){
      return 0;
    }

    @Override
    public String getInfo(){
         return "sub";
    }


    @Deprecated
    public static void m2(){

    }

    public static  void stMethod(){
        System.out.println("Sub class static method");
    }

    public static void main(String[] args) {

    }

}
