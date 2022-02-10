public class Truck extends Car {
    boolean loaded;

    public Truck(int numberOfWheels, boolean loaded){
        super(numberOfWheels);

    }

    public boolean isLoaded() {
        return loaded;
    }

    public void load() {
        this.loaded = true;
    }

    public void unload() {
        this.loaded = false;
    }


    public String toString() {
        return String.format("Number of Wheels: %1$d, Mileage: %2$d, Is Loaded: %3$d", this.getNumberOfWheels(), this.getMileage(), this.isLoaded());
    }

    @Override
    public long getPrice() {
        return 5000000L * this.getNumberOfWheels();
    }
}
