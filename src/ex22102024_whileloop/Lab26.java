package ex22102024_whileloop;

public class Lab26 {
    public static void main(String[] args) {
        // Take a user input for the age  and print the output
        // 30, 29, 28, 27....
        String arg_age = args[0];
        int age = Integer.parseInt(arg_age);

        while (age > 0) {
            System.out.println(age);
            age--;
        }

    }
}
