package ex10102024;

public class Lab007 {
    public static void main(String[] args) {
        Boolean a=true, b=false;

        System.out.println(a && b);  // false
        System.out.println(a || b);  // true
        System.out.println(!a);      // false
        System.out.println(!b);      // true

        b=true;
        System.out.println( a && b);  // true
        System.out.println( a || b);  // true
        System.out.println( !b );  // false

    }
}
