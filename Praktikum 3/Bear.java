public class Bear extends Animal implements Carnivore, Herbivore{
    public Bear(){
        super(125,"MOUNTAIN");
    }
    public Bear(int rawPower){
        super(rawPower, "MOUNTAIN");
    }

    @Override
    public void speak() {
        System.out.println("I'm a Good Bear.");
    }

    @Override
    public void eatMeat() {
        System.out.println("I'm eating a meat.");
    }

    @Override
    public void hunt(Animal animal) {
        if(this.getRawPower() > animal.getRawPower()){
            eatMeat();
        }
    }

    @Override
    public void eatPlant() {
        System.out.println("I'm eating a plant.");
    }
}
