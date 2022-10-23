package Project2;
//Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimeter.
//Create 2 classes Circle & Square that implements functionality defined in the Shape Interface. Test your code.

public interface Shape {
    static double pi=3.14;
    default void calculateArea() {
        System.out.println("Testing method calculateArea");
    }
    default void calculatePerimeter() {
        System.out.println("Testing method calculatePerimeter");
    }
}
class Circle implements Shape {
       Circle(double radius){

}

}
class Square implements Shape {
    Square(double side) {

    }
}
class Main {
    public static void main(String[] args) {
        Circle circle=new Circle(10);
            circle.calculateArea();
            circle.calculatePerimeter();
            Square square=new Square(20);
            circle.calculateArea();
            square.calculatePerimeter();
        }
    }
