public class Homework3 {
    public static void main(String[] args) {
        byte X = 1;
        byte Y = 2;
        byte Z = 3;

        System.out.println(calculationVector(X,Y,Z));
    }

    private static String  calculationVector(byte X, byte Y, byte Z) {
        double vectorLenth = (Math.sqrt( X * X + Y * Y + Z * Z ) );
        double firstVector = ( X / vectorLenth );
        double secondVector = ( Y / vectorLenth );
        double thirdVector = ( Z / vectorLenth );

        return new String("Unit Vector of numbers (" +X+", "+Y+", "+Z+") is (" +firstVector+", "+secondVector+", "+thirdVector+")");


    }
}
