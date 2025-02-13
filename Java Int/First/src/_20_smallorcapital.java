import java.util.Scanner;

public class _20_smallorcapital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char hi;
        System.out.println("Enter an alphabet to see if it is small or capital");
        hi = sc.next().charAt(0);
        if(hi>='A'&&hi<='Z')
        {
            System.out.println("Capital");
        }
        else
        {
            System.out.println("Small");
        }
    }
}