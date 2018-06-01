import java.util.Scanner;

public class Homework3_2 {
    public static void main(String[] args) {
        System.out.println("Fill something: ");
        Scanner scan = new Scanner(System.in);
        String stroka = scan.nextLine();
        String delimetre = "\\s";

        String[] words = delimetrString(stroka,delimetre);

        reverseString(words);

    }
    private static String[] delimetrString(String stroka, String delimetre){
        String[] delimetrWords = stroka.split(delimetre);
        return delimetrWords;
    }

    private static void reverseString(String[] words) {
        for (int i=0; i<words.length;i++){
            StringBuilder reverseWord = new StringBuilder(words[i]);
            System.out.println(reverseWord.reverse().toString());
        }
    }

}
