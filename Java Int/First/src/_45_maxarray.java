import java.util.Scanner;

public class _45_maxarray {
    int[] arr;
    int size;

    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        size = scanner.nextInt();
        arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
    }

    int findMax() {
        int max = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    void output() {
        System.out.println("Maximum value: " + findMax());
    }

    public static void main(String[] args) {
        _45_maxarray obj = new _45_maxarray();
        obj.input();
        obj.output();
    }
}