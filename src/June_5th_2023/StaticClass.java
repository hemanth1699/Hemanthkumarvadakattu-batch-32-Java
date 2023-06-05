package June_5th_2023;

public class StaticClass {

    static  int classVar;

    static {
        classVar=100;
    }
    public static int getClassVar() {
        return classVar;
    }
}
