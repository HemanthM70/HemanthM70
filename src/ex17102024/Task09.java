package ex17102024;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of side A");
        int side1= sc.nextInt();
        System.out.println("Enter the value of side B");
        int side2= sc.nextInt();
        System.out.println("Enter the value of side C");
        int side3= sc.nextInt();

        if(side1==side2 && side2==side3)
        {
            System.out.println("It is a -> Equilateral Triange" );
        } else if (side1==side2 || side1==side3 || side2==side3)
        {
            System.out.println("It is a -> Isosceles Triange");
        }
        else
        {
            System.out.println("It is a -> Scalene Triange");
        }

    }
}
