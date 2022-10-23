package Project2;
//Create a Class Car that would have the following fields: carPrice and color and method calculateSalePrice()
// which should be returning a price of the car.
//Create 2 sub classes: Sedan and Truck. The Truck class has a field as weight and has its own implementation of calculateSalePrice() method
//in which returned price is calculated as following: if weight>2000 then returned price car should include 10% discount, otherwise 20% discount.
//The Sedan class has field as length and also does its own implementation of calculateSalePrice():
// if length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount

public class Car {
    double carPrice;
    String color;
    double calculateSalePrice(String color,double carPrice) {
        return carPrice;
    }
}
class Sedan extends Car {
    double length;

    double calculateSalePrice(String color, double length, double carPrice) {
        this.color = color;
        this.length = length;
        this.carPrice = carPrice;
        if (length > 20) {
            return carPrice * .95;
        } else {
            return carPrice * .9;
        }
    }
}
    class Truck extends Car {
        double weight;

        double calculateSalePrice(double carPrice, double weight, String color) {
            this.color=color;
            this.weight=weight;
            this.carPrice=carPrice;
            if (weight > 2000) {
                return carPrice * .9;
            } else {
                return carPrice * .8;
            }
        }
    }
