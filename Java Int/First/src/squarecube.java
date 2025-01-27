import java.util.Scanner;

public class squarecube {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int num1 ;

        System.out.println("Enter NUmber To Find Square & Cube");
        num1 = sc.nextInt();

        System.out.println("Square Root is "+(num1*num1));
        System.out.println("Cube Root is "+(num1*num1*num1));

    }
}
