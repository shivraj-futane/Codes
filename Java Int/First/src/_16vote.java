import java.util.Scanner;

public class _16vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte age;
        System.out.println("Enter Your Age");
        age = sc.nextByte();

        if (age>=18){
            System.out.println("You Are Eligible TO Vote");
        }
        else {
            System.out.println("You Are Not Eligible To Vote");
        }

    }
}
