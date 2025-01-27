import java.util.Scanner;

public class swapbytemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b,temp;

        System.out.println("Enter First Number");
        a = sc.nextInt();

        System.out.println("Enter Second Number");
        b = sc.nextInt();


        temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping Your Numbers First ="+a);
        System.out.println("After Swapping Your Numbers Second ="+b);
    }
}
