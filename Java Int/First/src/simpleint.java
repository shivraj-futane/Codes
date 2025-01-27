import java.util.Scanner;

public class simpleint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double prin,rate,num,intrest;

        System.out.println("Enter Principle Amount ");
        prin = sc.nextDouble();

        System.out.println("Enter Rate Of Interest");
        rate = sc.nextDouble();

        System.out.println("Enter Number Of Years");
        num = sc.nextDouble();

        intrest = (prin * rate * num)/100;

        System.out.println("Your Interest Is"+intrest);

    }
}
