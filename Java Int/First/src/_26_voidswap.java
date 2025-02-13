import java.util.Scanner;

public class _26_voidswap {
    Scanner sc = new Scanner(System.in);
    int a, b,temp;

    void input(){
        System.out.println("Enter 2 Nummber TO swap");
        a=sc.nextInt();
        b= sc.nextInt();
    }

    void swap(){
        temp = a;
        a = b;
        b = temp;
    }

    void output(){
        System.out.println("After Swapping A =  "+a);
        System.out.println("After Swapping B = "+b);
    }

    public static void main(String[] args) {
        _26_voidswap obj = new _26_voidswap();
        obj.input();
        obj.swap();
        obj.output();
    }
}
