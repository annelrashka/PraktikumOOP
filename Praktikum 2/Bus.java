public class Bus extends Car{
    int maxCapacity;

    public Bus(int maxCapacity){
        super(6);
        this.maxCapacity = maxCapacity;
    }

    public int getMaxCapacity() {
        return this.maxCapacity;
    }

    public String toString() {
        return String.format("Number of Wheels: %1$d, Mileage: %2$d, Max Capacity: %3$d", this.getNumberOfWheels(), this.getMileage(), this.maxCapacity);
    }

    @Override
    public long getPrice() {
        long busMil = this.getMileage();

        if (busMil >= 0 && busMil <= 10000){
            return 1000000L * this.maxCapacity;
        }
        else {
            return 500000L * this.maxCapacity;
        }
    }
}
