package ex18102024;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {

        System.out.println("Enter the number of the Month from 1 to 12");
        Scanner sc= new Scanner(System.in);
        int month= sc.nextInt();
        switch (month){
            case 1: System.out.println("Entered Month is January"); break;
            case 2: System.out.println("Entered Month is February"); break;
            case 3: System.out.println("Entered Month is March"); break;
            case 4: System.out.println("Entered Month is April"); break;
            case 5: System.out.println("Entered Month is May"); break;
            case 6: System.out.println("Entered Month is June"); break;
            case 7: System.out.println("Entered Month is July"); break;
            case 8: System.out.println("Entered Month is August"); break;
            case 9: System.out.println("Entered Month is Septumber"); break;
            case 10: System.out.println("Entered Month is Octomber"); break;
            case 11: System.out.println("Entered Month is November"); break;
            case 12: System.out.println("Entered Month is December"); break;
            default: System.out.println("Invalid, Enter the number from 1 to 12");

        }
    }
}
