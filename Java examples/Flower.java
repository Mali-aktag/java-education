// Üst sınıf (Base Class) - Flower
class Flower {
    String color;
    String season;

    // Constructor
    public Flower(String color, String season) {
        this.color = color;
        this.season = season;
    }

    // Çiçeklerin ortak metodu
    public void bloom() {
        System.out.println("The flower is blooming in " + season + ".");
    }
}

// Alt sınıf (Derived Class) - Rose
class Rose extends Flower {
    boolean hasThorns;

    // Rose sınıfı constructor'ı
    public Rose(String color, String season, boolean hasThorns) {
        super(color, season);  // Üst sınıf constructor'ını çağırıyoruz
        this.hasThorns = hasThorns;
    }

    // Rose'a özgü bir metot
    public void smell() {
        System.out.println("The " + color + " rose smells wonderful!");
    }

    @Override
    public void bloom() {
        System.out.println("The " + color + " rose is blooming in " + season + ".");
    }
}

// Alt sınıf (Derived Class) - Tulip
class Tulip extends Flower {
    int petals;

    // Tulip sınıfı constructor'ı
    public Tulip(String color, String season, int petals) {
        super(color, season);  // Üst sınıf constructor'ını çağırıyoruz
        this.petals = petals;
    }

    // Tulip'e özgü bir metot
    public void showPetals() {
        System.out.println("The tulip has " + petals + " petals.");
    }

    @Override
    public void bloom() {
        System.out.println("The " + color + " tulip is blooming in " + season + ".");
    }
}

// Ana sınıf
public class Main {
    public static void main(String[] args) {
        // Rose nesnesi oluşturma
        Rose myRose = new Rose("red", "spring", true);
        myRose.bloom();      // Rose sınıfındaki bloom metodu
        myRose.smell();      // Rose'a özgü metot

        // Tulip nesnesi oluşturma
        Tulip myTulip = new Tulip("yellow", "summer", 6);
        myTulip.bloom();     // Tulip sınıfındaki bloom metodu
        myTulip.showPetals();// Tulip'e özgü metot
    }
}
