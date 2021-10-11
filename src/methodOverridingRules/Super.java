package methodOverridingRules;

import methodOverriding.Animal;

public class Super {

        public void m1(){

        }

        public void m2(){

        }

        public void m3(){

        }

        protected void m4(){

        }

        void m5(){}


        void m6(){}


        private void m7(){}
    // private methods cannot be overriden
        // since they are not inherited to subclass



       public void m8(){}

        public Object m9(){
                return 0;
        }

        public Integer m10(){
                return 0;
        }


        public double m11(){
                return 0;
        }


        public Animal m12(){
                return null;
        }

        public Super m13(){
                return null;
        }



}
