package CoreJavaPreparation.ClassAndObject.core2web;

class BlinkitOrder{
    int quantity = 2;
    double totalAmount = 350;
    static String deliveryService = "blinkit";
    BlinkitOrder(){
        System.out.println("New Order Recieved");
    }
    void calculateBill(){
        System.out.println("Order Summary");
        System.out.println("Quantity : "+quantity);
        System.out.println("Total Amount : "+totalAmount);
    }
    static void deliveryDetails(){
        System.out.println("Delivery Service : "+deliveryService);
        BlinkitOrder order1 = new BlinkitOrder();
        System.out.println("Quantity : "+order1.quantity);
        System.out.println("Amount : "+order1.totalAmount);
    }
    public static void main(String[] args){
        BlinkitOrder order1 = new BlinkitOrder();
        order1.calculateBill();
        deliveryDetails();
    }
}
