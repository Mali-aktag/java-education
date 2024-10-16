// Üst sınıf (Base Class)
class Vehicle {
    String brand;
    int year;

    // Constructor
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Üst sınıf metodu
    public void start() {
        System.out.println(brand + " is starting.");
    }

    // Üst sınıf metodu
    public void stop() {
        System.out.println(brand + " is stopping.");
    }
}

// Alt sınıf (Derived Class) - Car
class Car extends Vehicle {
    int doors;

    // Car sınıfı constructor'ı
    public Car(String brand, int year, int doors) {
        super(brand, year);  // Üst sınıf constructor'ını çağırıyoruz
        this.doors = doors;  // Car'a özgü özelliği atıyoruz
    }

    // Car'a özgü bir metot
    public void honk() {
        System.out.println(brand + " car is honking.");
    }

    @Override
    public void start() {
        System.out.println(brand + " car is starting.");
    }
}

// Alt sınıf (Derived Class) - Bike
class Bike extends Vehicle {
    boolean hasPedals;

    // Bike sınıfı constructor'ı
    public Bike(String brand, int year, boolean hasPedals) {
        super(brand, year);  // Üst sınıf constructor'ını çağırıyoruz
        this.hasPedals = hasPedals;  // Bike'a özgü özelliği atıyoruz
    }

    // Bike'a özgü bir metot
    public void ringBell() {
        System.out.println(brand + " bike is ringing the bell.");
    }

    @Override
    public void start() {
        System.out.println(brand + " bike is starting.");
    }
}

// Ana sınıf
public class Main {
    public static void main(String[] args) {
        // Car nesnesi oluşturma
        Car myCar = new Car("Toyota", 2020, 4);
        myCar.start();      // Car sınıfındaki start metodu
        myCar.honk();       // Car'a özgü metot
        myCar.stop();       // Üst sınıftan gelen stop metodu

        // Bike nesnesi oluşturma
        Bike myBike = new Bike("Giant", 2018, true);
        myBike.start();     // Bike sınıfındaki start metodu
        myBike.ringBell();  // Bike'a özgü metot
        myBike.stop();      // Üst sınıftan gelen stop metodu
    }
}
