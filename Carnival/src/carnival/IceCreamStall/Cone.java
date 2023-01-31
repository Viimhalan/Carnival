package carnival.IceCreamStall;

public class Cone extends ContainerDecorator{

    public Cone(IceCream icecream) {
        this.icecream = icecream;
    }

    public String getDescription() {
        return icecream.getDescription() + ", Cone";
    }

    protected int cost() {
        return icecream.cost() + coneCost;
    }
    
}
