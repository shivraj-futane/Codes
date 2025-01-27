
import java.util.Scanner;
public class storeandprintarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int s = 0;
        if (sc.hasNextInt()) {
            s = sc.nextInt();
        }
        int[] arr = new int[s];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < s; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
        }
        System.out.println( "The elements of the array are: ");
        for (int i = 0; i < s; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}