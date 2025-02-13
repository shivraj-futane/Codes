import java.util.Scanner;

public class _47_countarray {
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

    int countOccurrences(int target) {
        int count = 0;
        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }

    void output() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to count occurrences: ");
        int target = scanner.nextInt();
        System.out.println("Occurrences of " + target + ": " + countOccurrences(target));
    }

    public static void main(String[] args) {
        _47_countarray obj = new _47_countarray();
        obj.input();
        obj.output();
    }
}