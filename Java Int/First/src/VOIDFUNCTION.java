import java.util.Scanner;

public class VOIDFUNCTION {
    Scanner sc = new Scanner(System.in);
    int a,b,c;

    void input()
    {
        System.out.println("Enter 2 Numbers");
        a= sc.nextInt();
        b= sc.nextInt();
    }
    void add()
    {
        c = a+b;
    }
    void output()
    {
        System.out.println("Your Addition is "+c);

    }

    public static void main(String[] args) {
        VOIDFUNCTION obj = new VOIDFUNCTION();
        obj.input();
        obj.add();
        obj.output();
    }

}
