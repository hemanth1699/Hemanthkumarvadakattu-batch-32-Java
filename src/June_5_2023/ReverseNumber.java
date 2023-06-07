package June_5_2023;
public class ReverseNumber {
    public static int reverseDigits(int n) {
        int rnumb = 0;

        while (n != 0) {
            int digit = n % 10;
            rnumb = rnumb * 10 + digit;
            n /= 10;
        }
        return rnumb;
    }
    public static void main(String[] args) {
        int n = 12345;
        System.out.println("Reverse number of " + n + " is " +reverseDigits(n));
    }
}