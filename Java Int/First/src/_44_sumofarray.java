import java.util.Scanner;

public class _44_sumofarray {
    int[] arr;
    int size;

    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        size = scanner.nextInt();
        arr = new int[size];

        System.out.println("Enter " + size + " elements for the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
    }

    void findSum() {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("Sum of all elements: " + sum);
    }

    public static void main(String[] args) {
        _44_sumofarray obj = new _44_sumofarray();
        obj.input();
        obj.findSum();
    }
}