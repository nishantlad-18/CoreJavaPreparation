package CoreJavaPreparation.ClassAndObject.core2web;

class Demo3 {
    int add(int x, int y){
        return x + y;
    }

    public static void main(String[] args){
        Demo3 obj = new Demo3();
        int retVal = obj.add(10,20);
        System.out.println(retVal);
        System.out.println(obj.add(30,40));
    }
}
