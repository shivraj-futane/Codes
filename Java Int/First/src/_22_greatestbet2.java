import java.util.Scanner;

public class _22_greatestbet2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("enter the first number: ");
        num1 = sc.nextInt();
        System.out.println("enter the second number: ");
        num2 = sc.nextInt();
        if(num1 > num2)
        {
            System.out.println("First number is greater "+num1);
        } else if (num1 == num2) {
            System.out.println("Both number are equal to each other");

        }
        else
        {
            System.out.println("The second number is greater "+num2);
        }
    }
}