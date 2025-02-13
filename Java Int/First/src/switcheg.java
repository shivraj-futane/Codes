import java.util.Scanner;

public class switcheg {
    Scanner sc = new Scanner(System.in);
    char ch;
    float a, b, res;
    void input() {

        System.out.println("Enter an operator(+, -, *, /)");
        ch = sc.next().charAt(0);
        if(ch != '+' && ch != '-' && ch != '*' && ch != '/')
        {
            System.out.println("Invalid operator! pls enter(+, -, *, /)");
            return;
        }

        System.out.println("Enter the first number: ");
        a = sc.nextFloat();
        System.out.println("Enter the second number: ");
        b = sc.nextFloat();


        switch (ch)
        {
            case '+':
                res = a + b;
                System.out.printf("%.1f + %.1f = %.1f", a, b, res);
                break;

            case '-':
                res = a - b;
                System.out.printf("%.1f - %.1f = %.1f", a, b, res);
                break;

            case '*':
                res = a * b;
                System.out.printf("%.1f * %.1f = %.1f", a, b, res);
                break;

            case '/':
                if(b!=0)
                {
                    res = a / b;
                    System.out.printf("%.1f / %.1f = %.1f", a, b, res);
                }
                else
                {
                    System.out.println("Error: Division by 0 is not allowed");
                }
                break;

            default:
                System.out.println("Invalid operator! pls enter(+, -, *, /)");
                break;
        }
    }
    public static void main(String[] args)
    {
        switcheg obj = new switcheg();
        obj.input();
    }
}