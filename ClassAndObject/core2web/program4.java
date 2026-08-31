package CoreJavaPreparation.ClassAndObject.core2web;
import java.util.*;

class Demo4 {
    void add(int x, int y){
        System.out.println(x+y);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of x and y : ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        Demo4 obj = new Demo4();
        obj.add(x,y);
    }
}
