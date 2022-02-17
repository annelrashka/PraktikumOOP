public abstract class Animal implements HavePower {
    private int rawPower;
    private String habitat;

    public Animal(int rawPower, String habitat){
        this.rawPower = rawPower;
        this.habitat = habitat;
    }

    public String getHabitat() {
        return this.habitat;
    }

    public int getRawPower() {
        return this.rawPower;
    }

    @Override
    public boolean isStrongerThan(HavePower rawPower) {
        return this.rawPower >  rawPower.getRawPower();
    }

    public void fight(Animal x ){
        if (this.rawPower > x.getRawPower() && this.habitat == x.getHabitat()){
            this.rawPower += x.getRawPower();
        }
    }

    public abstract void speak();
}
