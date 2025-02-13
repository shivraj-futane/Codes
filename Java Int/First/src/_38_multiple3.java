import java.util.Scanner;

public class _38_multiple3 {
    Scanner sc = new Scanner(System.in);
    int a;

    void input()
    {
        System.out.println("Enter a number till where you want to see the multiple of 3: ");
        a = sc.nextInt();
    }

    void output()
    {
        for(int i = 3; i<=a; i = i+3)
        {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        _38_multiple3 d = new _38_multiple3();
        d.input();
        d.output();
    }
}
