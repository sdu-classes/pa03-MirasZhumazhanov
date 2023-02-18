public class Calculator {
    int firstNum;
    int secondNum;

    public Calculator(int firstNum, int secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    public int Add() {
        try {
            if (this.firstNum < 0 || this.secondNum < 0) {
                throw new ArithmeticException();
            }
        } catch (ArithmeticException ae) {
            System.out.println("Numbers should be positive");
        }
        return this.firstNum + this.secondNum;
    }

    public int Substract() {
        try {
            if (this.firstNum < 0 || this.secondNum < 0) {
                throw new ArithmeticException();
            }
        } catch (ArithmeticException ae) {
            System.out.println("Numbers should be positive");
        }
        return this.firstNum - this.secondNum;
    }

    public int Multiplication() {
        try {
            if (this.firstNum == 0 || this.secondNum == 0) {
                throw new ArithmeticException();
            }
        } catch (ArithmeticException ae) {
            System.out.println("Numbers shouldnt be equal to Zero");
        }
        return this.firstNum * this.secondNum;
    }

    public int Division() {
        try {
            if (this.firstNum == 0 || this.secondNum == 0) {
                throw new ArithmeticException();
            }
        } catch (ArithmeticException ae) {
            System.out.println("Numbers shouldnt be equal to Zero");
        }
        return this.firstNum / this.secondNum;
    }

}