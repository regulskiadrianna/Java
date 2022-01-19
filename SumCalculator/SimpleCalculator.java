public class SimpleCalculator {

    // Instance variables
    private double firstNumber;
    private double secondNumber;

    // Instance methods
    public double getFirstNumber() {
        return this.firstNumber;
    }

    public double getSecondNumber() {
        return this.secondNumber;
    }

    public void setFirstNumber(double number) {
        firstNumber = number;
    }

    public void setSecondNumber(double number) {
        secondNumber = number;
    }

    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }

    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }

    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }

    public double getDivisionResult() {
        return (secondNumber == 0.0) ? 0.0 : firstNumber / secondNumber;
    }
}