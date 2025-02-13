import java.util.Scanner;

public class _25_digitalphasymbol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char hello;
        System.out.println("Enter To check  ");
        hello = sc.next().charAt(0);
        if(hello >= 'a' && hello <= 'z' || hello >= 'A' && hello<= 'Z')
        {
            System.out.println("character");
        } else if (hello>='0'&& hello<= '9') {
            System.out.println("digit");
        }
        else
        {
            System.out.println("special symbol");
        }
    }
}