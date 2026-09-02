package CoreJavaPreparation.ClassAndObject.core2web;

class Player{
    int jerNo = 18;
    String playerName = "Virat";
    static int x = 50;
    static String country = "India";
    void playerInfo(){
        System.out.println(jerNo);
        System.out.println(playerName);
        System.out.println(x);
        System.out.println(country);
    }
    static void displayData(){
        Player obj = new Player();
        System.out.println(obj.jerNo);
        System.out.println(obj.playerName);
        System.out.println(x);
        System.out.println(country);
    }
    public static void main(String[] args){
        Player obj = new Player();
        obj.playerInfo();
        obj.displayData();
    }
}