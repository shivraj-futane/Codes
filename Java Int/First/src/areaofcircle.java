import java.util.Scanner;


public class areaofcircle {
    public static void main(String[] args) {
        Scanner are = new Scanner(System.in);
        System.out.println("Enter Radius To Find Area Of Circle");

        float pie=3.14f;
        float radius;

        radius=are.nextFloat();
        float result = pie*(radius * radius);

        System.out.println("Your Answer Is "+result);


    }
}
