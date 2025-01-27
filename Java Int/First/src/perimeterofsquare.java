import java.util.Scanner;

public class perimeterofsquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int side;

        System.out.println("Enter SIde TO FInd Perimeter of Square");
        side = sc.nextInt();

        System.out.println("Perimeter is "+(4*side));
    }
}
