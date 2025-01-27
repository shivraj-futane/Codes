import java.util.Scanner;

public class user {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Two Numbers");
        int num1,num2;
        num1=sc.nextInt();
        num2=sc.nextInt();

        int result = num1+num2;

        System.out.println("Your Addition = "+result);

    }
}
