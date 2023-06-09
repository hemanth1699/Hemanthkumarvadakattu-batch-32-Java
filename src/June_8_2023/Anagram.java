package June_8_2023;

import java.util.Arrays;
public class Anagram {
    public static boolean anagram(String str1, String str2) {
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();
            char[] ss1 = str1.toCharArray();
            char[] ss2 = str2.toCharArray();
            Arrays.sort(ss1);
            Arrays.sort(ss2);
            return Arrays.equals(ss1,ss2);
        }
    public static void main(String[] args) {
        String str1 = "Tone";
        String str2 = "Note";
        if(anagram(str1,str2))
        {
            System.out.println(str1 +" and "+ str2+ " are anagrams");
        }
        else{
            System.out.println(str1 +" and "+ str2+ " are not anagrams");
        }
    }

}