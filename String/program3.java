package CoreJavaPreparation.String;

class program3 {
    public static void main(String[] args){

        String str1 = "Pratik";
        String str2 = new String("Nishant");
        String str3 = "Pratik";
        String str4 = new String("Nishant");

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));
    }    
}
