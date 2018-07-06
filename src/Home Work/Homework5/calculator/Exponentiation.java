package calculator;

/**
 * Операция возведения в степень
 * @author ShcherbynaAndrey
 */
public class Exponentiation implements BinaryOperation {

    @Override
    public double resultFor(double left, double right){
        return Math.pow(left,right);
    }

}
