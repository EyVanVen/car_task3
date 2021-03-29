package task4;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        Car car1 = new Car(1967);
        Car car2 = new Car(2011, 150);
        Car car3 = new Car(1980, 100, 4);
        Car car4 = new Car(2014, 250, 3, "Cream");


        System.out.println("Year: " + car.year + ", weight: " + car.weight + ", speed: " + car.speed + ", color: "  + car.color);
        System.out.println("Year: " + car1.year + ", weight: " + car1.weight + ", speed: " + car1.speed + ", color: "  + car1.color);
        System.out.println("Year: " + car2.year + ", weight: " + car2.weight + ", speed: " + car2.speed + ", color: "  + car2.color);
        System.out.println("Year: " + car3.year + ", weight: " + car3.weight + ", speed: " + car3.speed + ", color: "  + car3.color);
        System.out.println("Year: " + car4.year + ", weight: " + car4.weight + ", speed: " + car4.speed + ", color: "  + car4.color);

    }
}




