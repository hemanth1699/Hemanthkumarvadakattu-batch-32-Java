package June_2_2023;

public class Main {
        public static void main(String[] args) {

            Vehicle V=new Vehicle();
            V.displayCar();
            V.displayBike();

            ChildClass childClass=new ChildClass(1,2);
            System.out.println("Parent Class Var = "+childClass.getParentVar());
            System.out.println("Child Class Var = "+childClass.getChildVar());

            System.out.println("Static Variable = "+StaticClass.getClassVar());

            Final finalClass=new Final();
            System.out.println("Final Class Var = "+finalClass.getFINAL_VAR());
        }
    }

