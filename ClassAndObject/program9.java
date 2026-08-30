package CoreJavaPreparation.ClassAndObject;

class Rectangle {

    int length;
    int breadth;

    static int calculateArea(int length, int breadth) {
        return length * breadth;
    }

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();

        r1.length = 10;
        r1.breadth = 5;

        int area = Rectangle.calculateArea(r1.length, r1.breadth);

        System.out.println("Length = " + r1.length);
        System.out.println("Breadth = " + r1.breadth);
        System.out.println("Area = " + area);
    }
}