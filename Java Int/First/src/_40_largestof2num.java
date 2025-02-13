import java.util.Scanner;

public class _40_largestof2num {
        Scanner sc = new Scanner(System.in);
            int num1 , num2 , temp;

            void input(){
                System.out.println("Enter a Number");
                num1= sc.nextInt();

                System.out.println("Enter a NUmber");
                num2=sc.nextInt();
            }

            void logic() {


                if (num1 == num2)
                    System.out.println("Both are Equal\n");
                else {
                    temp = num1 > num2 ? num1 : num2;
                    System.out.println(temp + " is largest");
                }
            }

    public static void main(String[] args) {
        _40_largestof2num obj = new _40_largestof2num();

        obj.input();
        obj.logic();
    }

    }



