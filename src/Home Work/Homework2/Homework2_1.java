import java.util.Scanner;

public class Homework2_1 {
    public static void main(String[] args) {
        System.out.println("Fill one of the number 3,6 or 9:");
        Scanner scr = new Scanner(System.in);
        int y = scr.nextInt();
        int x = y/3;
        printWeb(y,x);
    }

    private static void width(int y){

        if (y ==3 ){
            System.out.printf("%n*   *   *   *   *%n");
        }
        else if (y ==6) {
            System.out.printf("%n*      *      *      *      *");
            System.out.printf("%n*      *      *      *      *%n");
        }
        else if (y==9){
            System.out.printf("%n*         *         *         *         *");
            System.out.printf("%n*         *         *         *         *");
            System.out.printf("%n*         *         *         *         *%n");
        }

    }
    private static void printFrane(int y){

        for (int i=0 ; i<y*4+5; i++){
            System.out.print("*");
        }
    }

    private static void printWeb(int y, int x){
        if (x == 1){
            for (int i =0;i<4; i++){
                printFrane(y);
                width(y);
            }
        }
        if (x == 2){
           for (int i =0;i<4; i++){
               printFrane(y);
               width(y);
           }
        }
        if (x==3){
            for (int i =0;i<=4; i++){
                printFrane(y);
                width(y);
            }
        }
        printFrane(y);
    }
}
