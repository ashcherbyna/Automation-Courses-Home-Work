public class Homework1 {
    public static void main(String[] args) {
        int x = 50;
        float y = 25.f;
        byte z = 5;
        double n = 15.6d;

        System.out.println(calculationFirst(x,y,z,n));
        System.out.println(calculationSecond(x,y,z,n));
        System.out.println(calculationThird(x,y,z,n));
        System.out.println(calculationFourse(x,y,z,n));

    }
    private static long calculationFirst(int x, float y, byte z, double n){
        return (long) ( x + ( y - 100 ) *  z / n );
    }
    private static int calculationSecond(int x, float y, byte z, double n){
        return (int) ( x - ( 50 + y * z ) * n ) + x;
    }
    private static float calculationThird(int x, float y, byte z, double n){
        return (float) ( x * ( y / ( z - 1 ) + 555 ) + n );
    }
    private static double calculationFourse(int x, float y, byte z, double n){
        return (double) ( - x / y + z * ( n + 1 ));
    }
}
