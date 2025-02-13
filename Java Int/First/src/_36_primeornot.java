import java.util.Scanner;

public class _36_primeornot {
    Scanner sc = new Scanner(System.in);
    int num, i, count=0;

    void input()
    {
        System.out.println("enter a number to see if the number iis prime or not: ");
        num = sc.nextInt();
    }
    void output()
    {
        for (i = 1; i<=num; i++)//3
        {
            if(num%i==0)//2/2==0
            {
                count++;//1
            }
        }
        if(count==2)
        {
            System.out.println("prime number");
        }
        else
        {
            System.out.println("not a prime number");
        }
    }

    public static void main(String[] args) {
        _36_primeornot obj = new _36_primeornot();
        obj.input();
        obj.output();
    }
}
