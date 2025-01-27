import java.util.Scanner;

public class _17_pasinggrade40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float per;
        System.out.println("Enter Your Percentage");
        per = sc.nextFloat();

        if (per>=40){
            System.out.println("pass");
        }
        else {
            System.out.println("Fail");
        }
    }
}
