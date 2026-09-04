package CoreJavaPreparation.ClassAndObject.core2web;

class Player{
    int jerNo;
    String playerName;
    Player(int jNo , String pName){
        jerNo = jNo;
        playerName = pName;
        System.out.println("Player Constructor");
    }
    void playerInfo(){
        System.out.println(jerNo);
        System.out.println(playerName);
    }
    public static void main(String[] args){
        Player obj1 = new Player(18,"Virat");
        obj1.playerInfo();
        Player obj2 = new Player(7,"MSD");
        obj2.playerInfo();
    }
}
