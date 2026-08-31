package CoreJavaPreparation.ClassAndObject.core2web;

class Demo {
    void add(int x, int y){
        System.out.println(x+y);
    }

    public static void main(String[] args){
        Demo obj = new Demo();
        obj.add(10,20);
    }
}
