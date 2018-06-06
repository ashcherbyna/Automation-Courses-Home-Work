import java.util.Scanner;

public class Homework3_2 {
    public static void main(String[] args) {
        System.out.println("Fill something: ");
        Scanner scan = new Scanner(System.in);
        String stroka = scan.nextLine();
        String delimetre = "\\s";
        String finishString = "";

        String[] words = delimetrString(stroka,delimetre);

        reverseString(words, finishString);

    }
    private static String[] delimetrString(String stroka, String delimetre){
        String[] delimetrWords = stroka.split(delimetre);
        return delimetrWords;
    }

    private static void reverseString(String[] words, String finishString) {
        for (int i=0; i<words.length;i++){
            StringBuilder reverseWord = new StringBuilder(words[i]);
            finishString += reverseWord.reverse().toString() + " ";
        }
        System.out.println(finishString);
    }

}
