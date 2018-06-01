public class Homework2_2 {
    public static void main(String[] args) {

        long number = 123456789;
        totalSum(number);
    }

    private static void totalSum(long number) {
        int result = 0;
        while (number>=1) {
            result +=(number%10);
            number/=10;
        }
        System.out.println("Total sum of all numbers = "+result);
    }
}
