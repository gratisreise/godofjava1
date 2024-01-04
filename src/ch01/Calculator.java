package ch01;

public class Calculator {
    public int add(int num1, int num2) {
        int sum;
        sum = num1 + num2;
        return sum;
    }

    public int addAll(int num1, int num2, int num3) {
        int sum = 0;
        // Insertcode here.
        return sum;
    }

    public int substract(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }

    public int multiply(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }

    public int divide(int num1, int num2) {
        int result = num1 / num2;
        return result;
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int add = cal.add(5, 7);
        int addAll = cal.addAll(5, 7, 9);
        int substract = cal.substract(5, 7);
        int multiply = cal.multiply(5, 7);
        int divide = cal.divide(10, 5);

        System.out.println("add = " + add);
        System.out.println("addAll = " + addAll);
        System.out.println("substract = " + substract);
        System.out.println("multiply = " + multiply);
        System.out.println("divide = " + divide);
    }
}
