package seminars.first.Calculator;
public class Calculator {
    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result;

        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("Division by zero is not possible");
                }
            default:
                throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;
    }


    public static double calculateDiscount(double purchaseAmount, int discountPercentage) {
        if (purchaseAmount < 0 || discountPercentage < 0 || discountPercentage > 100) {
            throw new IllegalArgumentException("Недопустимые аргументы: сумма покупки и процент скидки должны быть неотрицательными, а процент скидки не может быть больше 100.");
        }

        return purchaseAmount - (purchaseAmount * discountPercentage / 100.0);
    }
}