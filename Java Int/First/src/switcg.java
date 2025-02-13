import java.util.Scanner;

public class switcg {
    Scanner sc = new Scanner(System.in);
    float n1,n2,res;
    public char ch;

    void input()
    {
        System.out.println("Enter Which Operation TO do");
        System.out.println("1.Addition 2.Substraction 3.Multiplication 4.Division 5.Remainder");
        ch = sc.next().charAt(0);



        System.out.println("Enter 2 Numbers");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
    }

    void add()
    {
        res = n1+n2;
    }
    void sub()
    {
        res = n1-n2;
    }
    void mul()
    {
        res = n1*n2;
    }
    void div()
    {
        res = n1/n2;
    }
    void mod()
    {
        res = n1%n2;
    }

    void output()
    {
        System.out.println("Your Answer Is "+res);
    }

    public static void main(String[] args) {

        switcg obj = new switcg();

        obj.input();
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();
        obj.mod();

        switch(obj.ch){
            case 1:
                System.out.println("Your Addition is ");
                obj.input();
                obj.add();
                break;

            case 2:
                System.out.println("Your Substraction is");
                obj.input();
                obj.sub();
                break;

            case 3:
                System.out.println("Your Multiplication is ");
                obj.input();
                obj.mul();
                break;


            case 4:
                System.out.println("Your Division is");
                obj.input();
                obj.div();
                break;


            case 5:
                System.out.println("Your Remainder is");
                obj.input();
                obj.mod();
                break;

            default:
                System.out.println("Enter Valid Input");
                break;
        }

             obj.output();
    }






}
