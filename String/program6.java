package CoreJavaPreparation.String;
import java.util.*;

class program6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name : ");
        String name = sc.nextLine();
        int count = 0;

        for(int i = 0; i < name.length(); i++){
            count++;
        }
        System.out.println("No. Of Characters in your name is : " + count);
    }    
}
