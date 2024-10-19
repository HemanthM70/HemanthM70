package ex18102024;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        int n1, n2, operator;
        System.out.println("1-add \n2-subtraction \n3-multiplication \n4-division");
        System.out.print("Choose Operator :");
        Scanner sc = new Scanner(System.in);
        operator = sc.nextInt();
        System.out.print("Enter the num1 :");
        n1= sc.nextInt();
        System.out.print("Enter the num2 :");
        n2= sc.nextInt();

        int result = 0;
        switch(operator)
        {
            case 1: result= (n1+n2);
                System.out.println("The operatior is Addition:" + result);break;
            case 2: result= (n1-n2) ;
                System.out.println("The operatior is subtraction :" + result); break;
            case 3: result= (n1*n2) ;
            System.out.println("The operatior is division :" + result); break;
            case 4: result= (n1/n2) ;
                System.out.println("The operatior is division :" + result); break;
            default:
                System.out.println("invalid operation");
        }




    }
}
