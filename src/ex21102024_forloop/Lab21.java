package ex21102024_forloop;

public class Lab21 {
    public static void main(String[] args) {
        for (int i = 0; i <= 25; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "-is Even");
                continue;
            }
            System.out.println(i+"-is Odd");
        }
    }
}
