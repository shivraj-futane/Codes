import java.util.Scanner;

public class _50_sortacend {
    String[] names = new String[5];

    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 names:");
        for (int i = 0; i < 5; i++) {
            names[i] = scanner.nextLine();
        }
    }

    void sortNames() {
        for (int i = 0; i < names.length - 1; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].compareTo(names[j]) > 0) {
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
    }

    void output() {
        System.out.println("Sorted names in ascending order:");
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        _50_sortacend obj = new _50_sortacend();
        obj.input();
        obj.sortNames();
        obj.output();
    }
}