import java.util.Scanner;

public class _28_simintvoid {
    Scanner sc = new Scanner(System.in);
    float prin,rate,year,interes;

    void input()
    {
        System.out.println("Enter Principle Amount");
        prin = sc.nextFloat();

        System.out.println("Enter Rate Of Interest");
        rate = sc.nextFloat();

        System.out.println("Enter No Of Year ");
        year = sc.nextFloat();
    }

    void interest(){
        interes = (prin*rate*year) /100;
    }

    void output(){
        System.out.println("Your Interest IS "+interes);
    }

    public static void main(String[] args) {
        _28_simintvoid obj = new _28_simintvoid();

        obj.input();
        obj.interest();
        obj.output();

    }
}
