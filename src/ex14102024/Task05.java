package ex14102024;

public class Task05 {
    public static void main(String[] args) {
        int a = 20;
        int b = 20;
        int c = 30;

        int result = (a >= b && a >= c) ? a : (b >= c ? b : c);
        System.out.println("Max Number is -> " +  result);
    }
}
