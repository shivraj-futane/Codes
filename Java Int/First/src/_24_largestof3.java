import java.util.Scanner;

public class _24_largestof3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Enter the first number: ");
        num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        num2 = sc.nextInt();
        System.out.println("Enter the third number: ");
        num3 = sc.nextInt();
        if(num1 > num2 && num1 > num3)
        {
            System.out.println("The first number is greatest "+num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("The second number is greatest "+num2);
        }
        else
        {
            System.out.println("The third number is the greatest "+num3);
        }
    }
}