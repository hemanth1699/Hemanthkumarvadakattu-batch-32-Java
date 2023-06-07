package June_6_2023;
public class SmallLargeofArray {
    public static void main(String[] args) {
        int a[] = {9, 7, 98, 10, 56, 12, 5};
        int smallnumb = a[0];
        int largenumb = a[0];

        int i = 1;
        while (i < a.length) {
            if (a[i] < smallnumb) {
                smallnumb = a[i];
            }
            if (a[i] > largenumb) {
                largenumb = a[i];
            }
            i++;
        }
        System.out.println("Smallest number: " + smallnumb + " ,Largest number: " + largenumb);
    }
}
