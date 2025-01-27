import java.util.Scanner;

public class circumofcircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float radius, pi= 3.14f;

        System.out.println("Enter Radius To Find circumstance Of Circle");
        radius = sc.nextFloat();

        System.out.println("Your circumstance is "+(2*pi*radius));


    }
}
