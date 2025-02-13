import java.util.Scanner;

public class _37_even{
    Scanner sc = new Scanner(System.in);
    int a;

    void input()
    {
        System.out.println("Enter a number till where you want to see the even numbers: ");
        a = sc.nextInt();
    }

    void output()
    {
        for(int i = 0; i<=a; i = i+2)
        {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        _37_even d = new _37_even();
        d.input();
        d.output();
    }
}
