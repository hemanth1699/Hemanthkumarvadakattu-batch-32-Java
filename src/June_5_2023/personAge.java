package June_5_2023;
public class personAge {
    static int Age = 18;
    public static void main(String[] args) {
        if (Age < 13) {
            System.out.println("Person is Kid with age of " + Age);
        } else if (Age >= 13) {
            if (Age <= 19) {
                System.out.println("Person is Teen with age of " + Age);
            } else if (Age > 19) {
                System.out.println("Person is Adult with age of " + Age);
            }
        }
    }
}