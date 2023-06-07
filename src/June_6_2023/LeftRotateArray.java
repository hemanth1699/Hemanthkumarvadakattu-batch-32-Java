package June_6_2023;

public class LeftRotateArray {
    public static void rotateArrayLeft(int[] arr, int x) {
        int n = arr.length;

        int[] temp = new int[x];

        for (int i = 0; i < x; i++) {
            temp[i] = arr[i];
        }

        for (int i = x; i < n; i++) {
            arr[i - x] = arr[i];
        }

        for (int i = 0; i < x; i++) {
            arr[n - x + i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int x = 2;

        rotateArrayLeft(arr, x);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
