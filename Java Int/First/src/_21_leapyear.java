import java.util.Scanner;

public class _21_leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long year;
        System.out.println("Enter Year TO Find Leap Year");
        year = sc.nextLong();

        if(year % 4 == 0){
            System.out.println("Leap Year");
        }
        else if (year%100==0)
        {
            System.out.println("Leap Year");
        }
        else if (year % 400 == 0)
        {
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not Leap Year");
        }


    }
}
