import java.util.Scanner;

public class periofrect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length,width;

        System.out.println("Enter Lenghth");
        length = sc.nextInt();

        System.out.println("Enter Width");
        width = sc.nextInt();

        System.out.println("Perimeter Of Rectangle is "+(2*(length+width)));
    }
}
