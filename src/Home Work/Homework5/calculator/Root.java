package calculator;

/**
 * Операция корень из числа
 * @author ShcherbynaAndrey
 */
public class Root implements BinaryOperation {

    @Override
    public double resultFor(double left, double right){
        return Math.pow(left, 1.0/right);
    }
}
