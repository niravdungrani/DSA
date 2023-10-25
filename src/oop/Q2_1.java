package oop;

public class Q2_1 {
    public static void main(String[] args) {
        Bycicle b1 = new Bycicle();
        b1.changeGear();
        b1.changeGear();
        b1.changeGear();
        Bike b2=new Bike();
        b2.changeGear();
        b2.changeGear();
        b2.changeGear();
        b2.changeGear();
        b2.changeGear();
        b2.changeGear();
        Car c1=new Car();
        c1.changeGear();
        c1.changeGear();
        c1.changeGear();
        c1.changeGear();
        c1.changeGear();
        c1.changeGear();
        c1.changeGear();
        c1.changeGear();



    }
}
interface Vehicle{
    public void changeGear();

}
class Bycicle implements Vehicle{
    int gear=0;

    @Override
    public void changeGear() {
        if (gear==2){
            System.out.println("Gear not allowed");
            return;
        }
        gear++;
        System.out.println("Bycicle Gear :"+gear);
    }
}
class Bike implements Vehicle{
    int gear=0;

    @Override
    public void changeGear() {
        if (gear==5){
            System.out.println("Gear not allowed");
            return;
        }
        gear++;
        System.out.println("Bike Gear :"+gear);
    }
}
class Car implements Vehicle{
    int gear=0;

    @Override
    public void changeGear() {
        if (gear==7){
            System.out.println("Gear not allowed");
            return;
        }
        gear++;
        System.out.println("Car Gear :"+gear);
    }
}

