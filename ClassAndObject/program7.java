package CoreJavaPreparation.ClassAndObject;

class Calculator {

    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        Calculator c1 = new Calculator();

        int result = Calculator.add(10, 20);

        System.out.println("Addition = " + result);
    }
}