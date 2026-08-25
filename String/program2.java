package CoreJavaPreparation.String;

class program2 {
    public static void main(String[] args){

        String str1 = "Nishant";
        String str2 = new String("Nishant");
        String str3 = "Nishant";
        String str4 = new String("Nishant");

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str2 == str4);
    }    
}
