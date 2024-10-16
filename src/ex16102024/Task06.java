package ex16102024;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your name");
        String name= scanner.next();
        System.out.println("Enter Your age");
        int age= scanner.nextInt();
        System.out.println("Enter Your salary");
        float salary= scanner.nextFloat();
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);


        scanner.close();

    }
}
