package methodOverridingRules;

import methodOverriding.Animal;
import methodOverriding.Cat;
import methodOverriding.Dog;
import methodOverriding.SiameseCat;

public class Sub extends Super{

    public void m1(int i){  // overloading

    }

    public void m2(){   // overriding since the signature is the same

    }

//     void m3(){
//
//    }

//     void m4(){
//
//    }

   public void m5(){}



//     private void m6(){}

    private void m7(){}


//    public int m8(){
//     return 0;}

      public String m9(){
                    return "";
            }

      public Integer m10(){
                    return 0;
            }

    public double m11(){  //Covariant type only applies to classes
        return 0;
    }

    public Cat m12(){
        return null;
    }

    public Sub m13(){
        return null;
    }

}
