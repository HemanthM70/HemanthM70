package ex17102024;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Score");
        int score=sc.nextInt();

        if(score <= 100 && score >=90)
        {
            System.out.println("The Grade is A");
        }
        else if (score <= 89 && score >=80)
        {
            System.out.println("The Grade is B");
        }
        else if (score <= 79 && score >=60)
        {
            System.out.println("The Grade is C");
        }
        else if (score <= 59 && score >=50)
        {
            System.out.println("The Grade is D");
        }
        else
        {
            System.out.println("The Grade is F");
        }

    }
}
