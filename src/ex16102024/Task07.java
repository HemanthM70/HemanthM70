package ex16102024;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter_num1");
        int num1=scanner.nextInt();
        System.out.println("Enter_num2");
        int num2= scanner.nextInt();
        int maximum_num= (num1>num2 ? num1 : num2);
        System.out.println("The Maximum num is->"+ maximum_num);
    }
}
