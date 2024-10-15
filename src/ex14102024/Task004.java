package ex14102024;

public class Task004 {
    public static void main(String[] args) {
            int a= 20, b = 45, c = 50;

            // Using ternary operator to find the largest number
            int result = (a > b) ? a:(b > c) ? b:c;
            System.out.println("The largest number is:"+result);
    }
}
