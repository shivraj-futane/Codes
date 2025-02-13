import java.util.Scanner;

public class _30_firstlastsum {
    Scanner sc = new Scanner(System.in);
    int a, res, res2;

    void input()
    {
        System.out.println("Enter a number: ");
        a = sc.nextInt();
    }
    void output()
    {
        res = a / 1000;
        res2 = a % 10;
        int res3 = res + res2;
        System.out.println("The addition of the first and last digit of the entered number is: "+res3);
    }
    public static void main(String[] args) {
        _30_firstlastsum hello = new _30_firstlastsum();
        hello.input();
        hello.output();
    }
}
