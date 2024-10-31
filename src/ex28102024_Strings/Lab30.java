package ex28102024_Strings;

public class Lab30 {
    public static void main(String[] args) {

        // length() - string
        String s= "Hemanth";
        System.out.println(s.length()); // 7
        System.out.println("Hemanth".length()); // 7 , we can use in 2 methods

        // concat() - joining the String
        String s1 = "welcome";
        String s2 = "to java";
        String s3 = "automation";

        System.out.println(s1+s2+s3); // welcometo javaautomation
        System.out.println(s1.concat(s2).concat(s3)); // welcometo javaautomation

        // trim - removing space right and left side
        String s4= "   Hemanth   ";
        System.out.println(s4); // printing with space
        System.out.println("Before trimmed :"+s4.length()); // trimmed with spaces along length
        System.out.println(s.trim()); // print by triming the space
        System.out.println("After trimmed:"+s.trim().length());// trimmed with length

        // charAt() - return the character of the string based on index

        String s5= "Hemanth";
        System.out.println(s5.charAt(5));
        System.out.println(s5.charAt(0));

        // contains() - return true/flase
        String s6="Hemanth";
        System.out.println(s6.contains("Hem")); // ture
        System.out.println(s6.contains("nth")); // ture
        System.out.println(s6.contains("hem")); // false, as H is not a capital letter
        System.out.println(s6.contains("henth")); // false, should be in sequence


        // equals () - equalsIgnoreCase() - compare string
        String s7= "hemanth";
        String s8= "hemanth";
        System.out.println(s7.equals(s8)); // true
        System.out.println(s.equalsIgnoreCase("Hemanth")); // true

        // replace() - single, multple sequence of a character in a string
        String s9= "hemanth is planing for a trip";
        System.out.println(s9.replace('a','X')); // replace a with X(hemXnth is plXning for X trip)
        System.out.println(s9.replace("trip","goa"));

        // substring()- extract substring form the main string
        s="welcome";
        System.out.println(s.substring(1,5)); // elco
        System.out.println(s.substring(0,3));

        // toUpperCase() - toLowerCase()
        s="HeMaNth";
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());

        // split()- split the string in to  multiple parts based on delimeter

        s="hemanth123@gmail.com";
        String a[] = s.split("@");
        System.out.println(a[0]); // will print @before  - hemanth123
        System.out.println(a[1]); // will print @ after - gmail.com

        // ex-1
        String amount="$2,10,20";  // need to remove $ and , from the string to get 21020
        System.out.println(amount.replace("$", "")); // we get 2,10,20
        System.out.println(amount.replace("$", "").replace(",","")); // 21020





    }
}
