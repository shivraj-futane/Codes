import java.util.Scanner;

public class _48_sortarray {
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

    void sortArray() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    void output() {
        System.out.println("Sorted array in ascending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        _48_sortarray obj = new _48_sortarray();
        obj.input();
        obj.sortArray();
        obj.output();
    }
}