
package task6;

public class CalcOOP {
    private double firstNumber;
    private double secondNumber;

    public CalcOOP(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }


    public double getFirstNumber() {     // Геттер для первого числа
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {    // Сеттер для первого числа
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {   // Геттер для второго числа
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {  // Сеттер для второго числа
        this.secondNumber = secondNumber;
    }

    public double plus() {
        return getFirstNumber() + getSecondNumber();
    }

    public double minus() {
        return getFirstNumber() - getSecondNumber();
    }


    public double multiplication() {
        return getFirstNumber() * getSecondNumber();
    }


    public double division () {
        if (getSecondNumber() == 0) throw new ArithmeticException("Ошибка, деление на ноль!");
        return getFirstNumber() / getSecondNumber();

    }

}