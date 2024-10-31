package ex22102024_whileloop;
import java.util.Scanner;

import static Tasks.Task010_add_sub_mul_div.*;

public class Lab29 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Num1");
        int a = scanner.nextInt();
        System.out.println("Enter the Num2");
        int b = scanner.nextInt();

        int result = sum_of_numbers(a, b);
        System.out.println("The Sum is ->" + result);
        int result_sub = sub_of_numbers(a, b);
        System.out.println("The sub is ->" + result_sub);
        int result_div = div_of_numbers(a, b);
        System.out.println("The div is ->" + result_div);

        scanner.close();
    }

        private static int div_of_numbers(int a , int b) {
           return a/b;

        }

        private static int sub_of_numbers( int a , int b) {
            return a-b;
        }

        private static int sum_of_numbers(int a , int b) {
            return a+b;
        }


}
