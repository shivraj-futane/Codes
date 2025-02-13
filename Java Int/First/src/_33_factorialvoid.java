import java.util.Scanner;

public class _33_factorialvoid {
    Scanner sc = new Scanner(System.in);
    int fact=1,i,number;

    void input(){
        System.out.println("Enter Number To Find Factorial");
        number=sc.nextInt();
    }

    void logic(){
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
    }

    void output()
    {
        System.out.println("Factorial is "+fact);
    }

    public static void main(String[] args) {
        _33_factorialvoid obj = new _33_factorialvoid();

        obj.input();
        obj.logic();
        obj.output();
    }

}
