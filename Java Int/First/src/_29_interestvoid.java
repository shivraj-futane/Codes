import java.util.Scanner;

public class _29_interestvoid {
    Scanner sc = new Scanner(System.in);
    float p, r, t, si;

    void input()
    {
        System.out.println("Enter principle: ");
        p = sc.nextFloat();
        System.out.println("Enter rate: ");
        r = sc.nextFloat();
        System.out.println("Enter time: ");
        t = sc.nextFloat();
    }
    void si()
    {
        si = (p * r * t)/100;
        System.out.println("The simple interest is: "+ si);
    }

    public static void main(String[] args) {
        _29_interestvoid d = new _29_interestvoid();
        d.input();
        d.si();
    }
}
