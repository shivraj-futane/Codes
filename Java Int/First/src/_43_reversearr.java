import java.util.Scanner;

public class _43_reversearr {
    int[] arr = new int[10];

    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 elements for the array:");
        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
        }
    }

    void outputReverse() {
        System.out.print("Array elements in reverse order: ");
        for (int i = 9; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        _43_reversearr obj = new _43_reversearr();
        obj.input();
        obj.outputReverse();
    }
}