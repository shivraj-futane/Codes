import java.util.Scanner;

public class _32_costpricevoid {
    Scanner sc = new Scanner(System.in);
    float cost,price,profit;

    void cost()
    {
        System.out.println("Enter Cost Price");
        cost= sc.nextFloat();
    }
    void price()
    {
        System.out.println("Enter Sales Price");
        price = sc.nextFloat();
    }

    void logic()
    {
        profit = profit - cost;
    }

    void output()
    {
        System.out.println("Your Profit IS "+profit);
    }

    public static void main(String[] args) {
        _32_costpricevoid hello = new _32_costpricevoid();

        hello.cost();
        hello.price();
        hello.logic();
        hello.output();
    }
}
