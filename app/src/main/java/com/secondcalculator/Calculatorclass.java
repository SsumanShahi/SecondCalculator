package com.secondcalculator;

public class Calculatorclass {

    int num1, num2;

    public Calculatorclass(int a, int b) {
        this.num1 = a;
        this.num2 = b;
    }

    public int add() {

        return num1 + num2;
    }

    public int sub() {
        return num1 - num2;
    }

    public int mul() {
        return num1 * num2;
    }

    public int div() {
        return num1 / num2;
    }
}
