package ch03;

public class Calculator {
    public static void main(String[] args) {
        Calculator calc=  new Calculator();
        
        System.out.println(calc.add(5, 10));
        System.out.println(calc.substract(5, 10));
        System.out.println(calc.divide(5, 10));
        System.out.println(calc.multiply(5, 10));

    }
    public int add(int a , int b){
        return a + b;
    }
    public int substract(int a , int b){
        return a - b;
    }
    public int divide(int a , int b){
        return a / b;
    }
    public int multiply(int a , int b){
        return a + b;
    }
}
