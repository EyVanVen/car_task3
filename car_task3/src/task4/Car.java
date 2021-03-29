package task4;

public class Car {
    int year;
    double speed;
    int weight;
    String color;

    public Car(){                   //конструктор по-умолчанию
        year = 2000;
        speed = 220.5;
        weight  = 2;
        color = "Grey";
    }

    public Car(int year){
        this.year = year;
        speed = 210.5;
        weight  = 2;
        color = "Red";
    }

    public Car(int year, double speed){
        this(year);
        this.speed = speed;
        weight  = 6;
        color = "Green";
    }

    public Car(int year, double speed, int weight){
        this(year, speed);
        this.weight  = weight;
        color = "Blue";
    }



    public Car(int year, double speed, int weight, String color){
        this(year, speed, weight);
        this.color = color;
    }

}
