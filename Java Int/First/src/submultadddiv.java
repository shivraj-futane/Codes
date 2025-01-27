import java.util.Scanner;

public class submultadddiv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 NUmber ");
        int num1,num2;
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        //int result = num1*num2;
        //int result1 = num1+num2;
        //int result2 = num1-num2;
        //int result3 = num1/num2;

        System.out.println("Your Multiplication is  "+ (num1*num2));
        System.out.println("Your Addition is  "+ (num1+num2));
        System.out.println("Your Substraction is  "+ (num1-num2));
        System.out.println("Your Division is  "+ (num1/num2));


    }
}
