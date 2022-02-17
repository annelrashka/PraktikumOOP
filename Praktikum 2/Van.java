public class Van extends Car{
    long basePrice;

    public Van(long basePrice){
        super(4);
    }

    @Override
    public long getPrice(){
        if ((this.getMileage() >= 0) & (this.getMileage() <= 1000)){
            return this.basePrice;
        }else if(((this.getMileage() > 1000) & (this.getMileage() <= 10000))){
            return (long)Math.floor(this.basePrice*0.75);
        }else{
            return (long)Math.floor(this.basePrice/2.0);
        }
    }
}
