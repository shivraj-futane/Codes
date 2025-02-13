import java.util.Scanner;

public class _49_inputdisplay {
    String[] names = new String[5];

    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 names:");
        for (int i = 0; i < 5; i++) {
            names[i] = scanner.nextLine();
        }
    }

    void output() {
        System.out.println("The entered names are:");
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        _49_inputdisplay obj = new _49_inputdisplay();
        obj.input();
        obj.output();
    }
}