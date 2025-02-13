import java.util.Scanner;

public class _39_gratestof3 {
    Scanner sc = new Scanner(System.in);
    float a, b, c;

    void input()
    {
        System.out.println("Enter the first number: ");
        a = sc.nextInt();
        System.out.println("Enter the second number: ");
        b = sc.nextInt();
        System.out.println("Enter the third number: ");
        c = sc.nextInt();
    }
    void output()
    {
        if(a == b && a == c && b == c)
        {
            System.out.println("All number are equal");
        } else if (a > b && a > c) {
            System.out.printf("%.2f is the greatest number", a);
        }
        else if(b > a && b > c)
        {
            System.out.printf("%.2f is the greatest number", b);
        }
        else
        {
            System.out.printf("%.2f is the greatest number", c);
        }
    }

    public static void main(String[] args) {
        _39_gratestof3 d = new _39_gratestof3();
        d.input();
        d.output();
    }
}
