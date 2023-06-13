package June_10th_2023;
public class StringInt{
    public static void StringToInteger(String s){
        try{
            int i = Integer.parseInt(s);
            System.out.println(i);
        }
        catch (NumberFormatException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
    public static void main(String[] args){
        StringToInteger("23");
        StringToInteger("45.67");
        StringToInteger("test");
        StringToInteger("123f");
    }
}

