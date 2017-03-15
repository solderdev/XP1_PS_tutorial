package at.sw2017.calculator;

/**
 * Created by Peter Sammer on 15.03.17.
 */

class Calculations {

    private Calculations() {
    }

    static int doAddition(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    static int doSubtraction(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    static int doMultiplication(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    static int doDivision(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            return 0;
        }
        return firstNumber / secondNumber;
    }
}
