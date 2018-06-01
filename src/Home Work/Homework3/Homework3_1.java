import java.util.Scanner;

public class Homework3_1 {
    public static void main(String[] args) {
        System.out.println("Fill something");
        Scanner scr = new Scanner(System.in);
        String stroka = scr.nextLine();

        StringBuilder reverseString = new StringBuilder(stroka);
        String reverseStringNew = reverseString.reverse().toString();

        System.out.println(palindromCheck(stroka,reverseStringNew));
    }

    private static String palindromCheck(String stroka, String reverseStringNew){
        if (stroka.equals(reverseStringNew)){
            return ("ItsPalindrom");
        }
        else{
            return  ("It is not a Palindrom");
        }
    }
}
