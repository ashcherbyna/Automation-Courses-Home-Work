package calculator;

/**
 * Операция вичитания
 * @author ShcherbynaAndrey
 */
public class Substraction implements BinaryOperation {

    @Override
    public double resultFor(double left, double right) {
        return left - right;
    }

}