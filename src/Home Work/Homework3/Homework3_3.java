import java.util.Scanner;
import java.util.Random;


public class Homework3_3{

    public static void main(String[] args) {
        System.out.println("Fill the length of Array:");
        Scanner scr = new Scanner(System.in);
        int number = scr.nextInt();

        int[] anArray = new int[number];
        int[] randomList = list(anArray);

        display(randomList);
    }

    private static int[] list(int[] anArray){
        for (int i=0; i<anArray.length;i++){
            anArray[i]=random();
        }
        return anArray;
    }

    private static int random(){
        Random random = new Random();
        int randomNum = random.nextInt();
        return randomNum;
    }

    private static void display(int[] randomList){
        for (int i = 0; i<randomList.length;i++){
            if (randomList[i]%3 == 0){
                System.out.println("Numbew /3 = "+randomList[i]);
            }
        }
    }

}