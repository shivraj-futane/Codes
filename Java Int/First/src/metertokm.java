import java.util.Scanner;

public class metertokm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float meter;

        System.out.println("Enter Distance In Meter");
        meter = sc.nextFloat();

        System.out.println("Distance in KM is km"+(meter/1000));
    }
}
