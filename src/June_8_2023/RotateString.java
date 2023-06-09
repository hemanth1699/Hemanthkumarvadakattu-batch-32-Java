package June_8_2023;
public class RotateString {
    public static boolean CompareRotateStr(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        } else {
            String s = s1 + s1;
            if (s.contains(s2)) {
                return true;
            }
            return false;
        }
    }
        public static void main (String[]args){
            String s1 = "JavaJ2eeStrutsHibernate";
            String s2 = "StrutsHibernateJavaJ2ee";
            System.out.println("String " + s2 + " is rotation of string " + s1 + " : " + CompareRotateStr(s1, s2));
        }
    }
