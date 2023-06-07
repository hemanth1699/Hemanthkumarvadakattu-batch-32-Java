package June_6_2023;
public class ReverseArray {
    public static void main(String[] args) {
        int a[] = {9,7,98,10,56,12,5};
        int s = 0;
        int e = a.length - 1;

        while (s < e) {
            int temp = a[s];
            a[s] = a[e];
            a[e] = temp;
            s++;
            e--;
        }
        for (int j : a) {
            System.out.print(j + " ");
        }
    }
}

