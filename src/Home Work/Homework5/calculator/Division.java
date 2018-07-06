package calculator;
/**
 * Операция деления
 * @author ShcherbynaAndrey
 */
public class Division implements BinaryOperation{

    @Override
    public double resultFor(double left, double right) {
        return left / right;
    }

}
