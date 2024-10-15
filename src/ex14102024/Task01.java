package ex14102024;

public class Task01 {
    public static void main(String[] args) {
        int a=20, b=30, c=10;
        int max_val = (a>b)? (a>c?a:c) : (b>c?b:c);
        System.out.println(max_val);
    }
}
