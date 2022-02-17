/**
 * Car.java
 * Kelas induk yang akan dimodelkan menjadi kelas-kelas turunan mobil
 * @author 18220026 Annel Rashka Perdana
 */

public abstract class Car {
    private int numberOfWheels;
    private long mileage;

    public Car(int numberOfWheels) {
        // Konstruktor, set mileage = 0
        this.numberOfWheels = numberOfWheels;
        this.mileage = 0;
    }

    public int getNumberOfWheels() {
        // Mengembalikan atribut numberOfWheels
        return this.numberOfWheels;
    }

    public long getMileage() {
        // Mengembalikan atribut mileage
        return this.mileage;
    }

    public void increaseMileage(long increment) {
        // Meningkatkan nilai atribut mileage
        this.mileage += increment;
    }

    public String toString() {
        // Mengembalikan informasi mobil dengan format: "Number of Wheels: {numberOfWheels}, Mileage: {mileage}"


        return String.format("Number of Wheels: %1$d, Mileage: %2$d", this.numberOfWheels, this.mileage);
    }

    public abstract long getPrice();
}
  