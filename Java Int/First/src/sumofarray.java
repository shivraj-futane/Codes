
import java.util.Arrays;
import java.util.Scanner;
public class sumofarray {
    public static void main(String args[]){

        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int myArray[] = new int [size];
        int sum = 0;
        System.out.println(" Enter the number of elements in the array: ");

        for(int i=0; i<size; i++){
            myArray[i] = s.nextInt();
            sum = sum + myArray[i];
        }
       // System.out.println("Elements of the array are: "+Arrays.toString(myArray));
        System.out.println("The sum of all elements is: "+sum);
    }
}