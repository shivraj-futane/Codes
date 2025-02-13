import java.util.Scanner;

public class _27_squarecubevoid {
    Scanner sc = new Scanner(System.in);
    int a,res,res1;

    void input()
    {
        System.out.println("Enter Number To Get Square & Cube ");
        a= sc.nextInt();
    }
    void square(){
        res = a*a;
    }
    void cube()
    {
        res1 = a*a*a;
    }
    void output()
    {
        System.out.println("Your Square Is "+res);
        System.out.println("Your Cube is"+res1);
    }

    public static void main(String[] args) {
        _27_squarecubevoid obj = new _27_squarecubevoid();

        obj.input();
        obj.square();
        obj.cube();
        obj.output();
    }

}
