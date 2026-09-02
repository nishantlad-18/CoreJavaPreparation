package CoreJavaPreparation.ClassAndObject.core2web;

class Demo {
    int x = 10;
    static int y = 20;

    public static void main(String[] args) {
        Demo obj1 = new Demo();
        Demo obj2 = new Demo();

        System.out.println(obj1.x);
        System.out.println(obj2.x);
        obj1.x = 50;
        System.out.println(obj1.x);
        System.out.println(obj2.x);

        System.out.println(obj1.y);
        System.out.println(obj2.y);
        obj1.y = 100;
        System.out.println(obj1.y);
        System.out.println(obj2.y);
    }
}
