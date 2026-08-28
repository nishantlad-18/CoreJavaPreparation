package CoreJavaPreparation.String;
import java.util.*;

class program7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        int count = 0;
        char ch[] = name.toCharArray();

        for(int i = 0; i < ch.length; i++){
            System.out.println(ch[i]);
        }
    }
}    
