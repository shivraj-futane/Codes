import java.util.Scanner;

public class areaofrect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length,width;

        System.out.println("Enter Length ");
        length = sc.nextInt();

        System.out.println("Enter Width ");
        width = sc.nextInt();

        System.out.println("Area Of Rectangle is "+(length*width));
    }
}
