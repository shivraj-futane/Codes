import java.util.Scanner;

public class daysandmonths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int days,months;

        System.out.println("Enter Days");
        days = sc.nextInt();

        months = days / 30 ;
        days = days % 30;

        System.out.println("Moths =  "+months);
        System.out.println("Days = "+days);
    }
}
