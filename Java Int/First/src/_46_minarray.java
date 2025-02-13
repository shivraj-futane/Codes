import java.util.Scanner;

public class _46_minarray {
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

    int findMin() {
        int min = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    void output() {
        System.out.println("Minimum value: " + findMin());
    }

    public static void main(String[] args) {
        _46_minarray hello = new _46_minarray();
        hello.input();
        hello.output();
    }
}