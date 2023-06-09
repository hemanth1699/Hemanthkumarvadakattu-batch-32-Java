package June_8_2023;

    public class Vowels {
        public static int countVowels(String str) {
            int count = 0;
            String vowels = "aeiouAEIOU";

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (vowels.indexOf(ch) != -1) {
                    count++;
                }
            }

            return count;
        }

        public static void main(String[] args) {
            String input = "Hemanth";
            int vowelCount = countVowels(input);

            System.out.println("Number of vowels: " + vowelCount);
        }
    }
