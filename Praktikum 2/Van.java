public class Van extends Car{
    long basePrice;

    public Van(long basePrice){
        super(4);
    }

    @Override
    public long getPrice() {
        long vanMil = this.getMileage();

        if (vanMil >= 0 && vanMil <= 1000){
            return this.basePrice;
        }
        else if (vanMil > 1000 && vanMil <= 10000){
            return (long) (Math.floor(this.basePrice*(0.75)));
        }
        else{
            return (long) Math.floor(this.basePrice/2);
        }
    }
}
