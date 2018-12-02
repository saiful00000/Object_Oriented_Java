package Inheritance;

public class BMW extends Car {

    int cc = 100;
    int modelNumber;
    int price;

    BMW(){
        System.out.println("\nHi !");
    }


    public static void main(String[] args){
        BMW car = new BMW();
        System.out.println(car.cc);

    }
}
