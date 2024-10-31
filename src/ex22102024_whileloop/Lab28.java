package ex22102024_whileloop;

public class Lab28 {
    public static void main(String[] args) {
        int number = 123456;
        int reverseNumber =0;
        while ( number != 0) {
            int digit = number % 10;
            reverseNumber = reverseNumber * 10 + digit;
            number/=10;
        }
        System.out.println("Reversed num:"+ reverseNumber);

    }
}
