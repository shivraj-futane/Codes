import java.util.Scanner;

public class _19_evenorodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.println("Enter Your Number");
        num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }

    }
}
