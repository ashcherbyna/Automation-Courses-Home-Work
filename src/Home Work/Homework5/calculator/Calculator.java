package calculator;

/**
 * Калькулятор
 * @author ShcherbynaAndrey
 */

public class Calculator {


    public double calculate(double val1, double val2, String operator) {
        BinaryOperation operation = getOperationFor(operator);

        if (operation == null) {
            System.out.println("Неизвестный оператор " + operator);
            return Double.NaN;
        }

        return operation.resultFor(val1, val2);
    }

    private BinaryOperation getOperationFor(String operator) {
        if ("*".equals(operator)) {
            return new Multiplication();
        } else if ("-".equals(operator)) {
            return new Substraction();
        } else if ("/".equals(operator)){
            return new Division();
        } else if ("+".equals(operator)){
            return new Addition();
        } else if ("sqrt".equals(operator)){
            return new Root();
        } else if ("log".equals(operator)){
            return new BaseLogarithm();
        } else if ("^".equals(operator)){
            return new Exponentiation();
        }

        return null;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println( calculator.calculate(456.546, 545.5465, "*") );
        System.out.println( calculator.calculate(456.546, 545.5465, "-") );
        System.out.println( calculator.calculate(10, 5, "/") );
        System.out.println( calculator.calculate(10, 5, "+") );
        System.out.println( calculator.calculate(25, 2, "sqrt") );
        System.out.println( calculator.calculate(25, 2, "log") );
        System.out.println( calculator.calculate(5, 2, "^") );
    }
}

