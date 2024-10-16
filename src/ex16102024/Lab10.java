package ex16102024;

import java.util.Scanner;

public class Lab10 {
    public static void main(String[] args) {
        // scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter to age\n");
        int age = scanner.nextInt();
        System.out.println( age>=25? "Allowed to Goa" : "Not Allowed to Goa");

        scanner.close();

    }
}

