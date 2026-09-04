package CoreJavaPreparation.ClassAndObject.core2web;

class Const {
    int x = 10;
    static int y = 20;
    Const(){
        System.out.println("In Constructor");
    }
    void fun(){
        System.out.println("In Fun : Instance");
        System.out.println(x);
        System.out.println(y);
    }
    static void gun(){
        System.out.println("In Gun : Static");
        Const obj = new Const();
        System.out.println(obj.x);
        System.out.println(obj.y);
    }
    public static void main(String[] args){
        Const obj = new Const();
        obj.fun();
        obj.gun();
    }
}
