package Project2;

public class CarTester {
    public static void main(String[] args) {
        Sedan sedan=new Sedan();
        System.out.println(sedan.calculateSalePrice("White", 12, 35000));
        Truck truck=new Truck();
        System.out.println(truck.calculateSalePrice(48000,2500,"Blue"));
    }
}
