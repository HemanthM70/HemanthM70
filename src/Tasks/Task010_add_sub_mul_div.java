package Tasks;

import java.util.Scanner;

public class Task010_add_sub_mul_div {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the Num1");
        int a= scanner.nextInt();
        System.out.println("Enter the Num 2");
        int b= scanner.nextInt();

        int result = sum_of_numbers(a,b);
        System.out.println("The Sum ->"+ result);

        int result_sub = sub_of_numbers(a,b);
        System.out.println("The sub ->"+ result_sub);

        int result_mul = mul_of_numbers(a,b);
        System.out.println("The Multi ->"+ result_mul);

        int result_div = div_of_numbers(a,b);
        System.out.println("The Div ->" + result_div);


                scanner.close();
    }
    static int div_of_numbers(int a, int b){
        return a/b;
    }

    static int mul_of_numbers(int a, int b) {
        return a*b;

    }

    static int sub_of_numbers(int a, int b) {
        return a-b;

    }

    static int sum_of_numbers(int a, int b) {
        return a+b;

    }
}
