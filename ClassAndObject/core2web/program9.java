package CoreJavaPreparation.ClassAndObject.core2web;

class Demo{
    int x = 10;
    int y = 20;
    Demo(){
        System.out.println("In Constructor");
    }
    void fun(){
        System.out.println(x);
        System.out.println(y);
    }
    public static void main(String[] args){
        Demo obj = new Demo();
        obj.fun();
    }
}