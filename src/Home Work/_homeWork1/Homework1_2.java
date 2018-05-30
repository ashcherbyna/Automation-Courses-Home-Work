public class Homework1_2 {
    public static void main(String[] args) {
        int number = 54321;

        int a = number / 10000;
        int b = ( number - a * 10000) / 1000;
        int c = ( number - a * 10000 - b * 1000 ) / 100;
        int d = ( number - a * 10000 - b * 1000 - c * 100 ) /10;
        int e = ( number - a * 10000 - b * 1000 - c *100 - d *10);

        System.out.printf("Number consists of numbers :%n%d%n%d%n%d%n%d%n%d",a,b,c,d,e);

    }
}

