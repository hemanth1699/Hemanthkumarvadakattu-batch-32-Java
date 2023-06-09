package June_8_2023;

public class ReverseString {
    public static String reverse(String s){
            String[] w = s.split(" ");
            String rStr = "";
            int i = 0;
            while (i < w.length) {
                String word = w[i];
                String rWord = "";
                for (int j = word.length()-1; j >= 0; j--)
                {
                    rWord += word.charAt(j);
                }
                rStr += rWord + " ";
                i++;
            }
            return rStr;
        }
        public static void main(String[] args){
            String s = "Java J2EE Reverse Me";
            System.out.println("Reverse of string '" + s + "' is: " + reverse(s));
        }
    }

