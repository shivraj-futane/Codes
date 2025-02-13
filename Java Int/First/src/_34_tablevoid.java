import java.util.Scanner;
public class _34_tablevoid
{

        Scanner sc = new Scanner(System.in);
        int num;
        void input() {
            System.out.print("Enter number: ");

             num = sc.nextInt();
        }

        void logic() {
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " * " + i + " = " + num * i);
            }
        }

    public static void main(String[] args) {
        _34_tablevoid obj = new _34_tablevoid();

        obj.input();
        obj.logic();
    }
}  