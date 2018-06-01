import java.util.Scanner;

public class Homework2_3 {
    public static void main(String[] args) {
        System.out.println("Fill a number of workers:");
        Scanner sc = new Scanner(System.in);
        int workers = sc.nextInt();
        int interview = proverka(workers);
        System.out.println(result(interview));
    }

    private static int proverka(int workers){
        if (workers >  1) {
            return workers-1;
        }
        else{
        return 1;
        }
    }

    private static int result(int interview){
        if(interview == 1){
            return 1;
        }
        else{
            return result(interview -1) + interview;
        }
    }
}
