import java.util.Scanner;

public class price {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float cost,sale,profit;
        System.out.println("Enter Cost Price");
        cost = sc.nextFloat();
        System.out.println("Enter Sale Price");
        sale = sc.nextFloat();

        profit = sale-cost;
        System.out.println("Your Profit Is "+profit);

    }
}
