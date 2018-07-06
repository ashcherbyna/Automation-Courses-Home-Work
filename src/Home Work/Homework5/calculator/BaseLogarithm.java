package calculator;

/**
 * Операция взятия логарифма по основанию
 * @author ShcherbynaAndrey
 */
public class BaseLogarithm implements BinaryOperation{

    @Override
    public double resultFor(double left, double right){
        return Math.log(right) / Math.log(left);
    }

}
