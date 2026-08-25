package CoreJavaPreparation.String;

class program4 {
    public static void main(String[] args){

        String str1 = "Raj";
        String str2 = "Sarade";
        String str3 = "RajSarade";

        System.out.println("str1 : " + str1);
        System.out.println("str2 : " + str2);
        System.out.println("str3 : " + str3);

        str1 = str1.concat(str2);

        System.out.println("str1 : " + str1);
    }    
}
