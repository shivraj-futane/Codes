import java.util.Scanner;

public class fartocelsiuss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float Far;

        System.out.println("Enter Fahrenheit To Convert in Celsius");
        Far = sc.nextFloat();

        System.out.println("Your Temp in Celsius is "+((Far -32.0)*5/9));
    }
}
