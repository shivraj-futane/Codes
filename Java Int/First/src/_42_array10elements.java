import java.util.Scanner;

public class _42_array10elements {
    int[] arr = new int[10];

    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 elements for the array:");
        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
        }
    }

    void output() {
        System.out.print("Array elements: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        _42_array10elements hello = new _42_array10elements();
        hello.input();
        hello.output();
    }
}