import java.util.Scanner;

public class _23_vowelornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        System.out.println("Enter a character to see if it is a vowel and not: ");
        ch = sc.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
        {
            System.out.println("The entered character is vowel");
        }
        else
        {
            System.out.println("The entered character is consonant");
        }
    }
}