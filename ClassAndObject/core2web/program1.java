package CoreJavaPreparation.ClassAndObject.core2web;

class Demo {
    int x = 10;
    static int y = 20;

    void fun(){
        System.out.println("In fun");
    }
    static void gun(){
        System.out.println("In gun");
    }

    public static void main(String[] args){
        int z = 30;
        System.out.println(z);
        System.out.println(y);
        gun();

        Demo obj1 = new Demo();
        Demo obj2 = new Demo();

        System.out.println(obj1.x);
        System.out.println(obj2.x);

        obj1.fun();
        obj2.fun();
    }
}
