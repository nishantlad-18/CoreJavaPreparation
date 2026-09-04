package CoreJavaPreparation.ClassAndObject.core2web;

class FoodOrder{
    int orderId = 101;
    double amount = 450;
    static String restaurant = "FoodHub";
    FoodOrder(){
        System.out.println("Order Created");
    }
    void displayOrder(){
        System.out.println("In displayOrder : Instance");
        System.out.println(orderId);
        System.out.println(amount);
        System.out.println(restaurant);
    }
    static void checkRestaurant(){
        System.out.println("In checkRestaurant : Static");
        FoodOrder obj = new FoodOrder();
        System.out.println(obj.orderId);
        System.out.println(obj.amount);
        System.out.println(obj.restaurant);
    }
    public static void main(String[] args){
        FoodOrder obj = new FoodOrder();
        obj.displayOrder();
        obj.checkRestaurant();
    }
}
