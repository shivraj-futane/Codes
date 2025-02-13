import java.util.Scanner;

public class _35_finnobichi {
    Scanner sc = new Scanner(System.in);
    int num, a = 0, b= 1, c, i;

    void input()
    {
        System.out.println("Enter a number till where you want to see the fibonacci series: ");
        num = sc.nextInt();
    }
    void output(){
        for (i = 1; i<=num; i++)
        {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        _35_finnobichi d = new _35_finnobichi();
        d.input();
        d.output();
    }
}
