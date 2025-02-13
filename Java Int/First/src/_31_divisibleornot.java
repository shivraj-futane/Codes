import java.util.Scanner;

public class _31_divisibleornot {
    Scanner sc = new Scanner(System.in);
    int a, b;

    void input() {
        System.out.println("Enter a number to see if this number is divisible by the second number: ");
        a = sc.nextInt();
        System.out.println("Enter the second number: ");
        b = sc.nextInt();
    }
    void output() {
        if (b == 0) {
            System.out.println("Divisible by 0 is not possible");
        } else if (a % b == 0) {
            System.out.println("Yes the first number is divisible by the second number ");
        } else {
            System.out.println("No the first number is not divisible by the second number");
        }
    }
    public static void main(String[] args) {
        _31_divisibleornot d = new _31_divisibleornot();
        d.input();
        d.output();
    }
}

