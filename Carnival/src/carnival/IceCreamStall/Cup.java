package carnival.IceCreamStall;

public class Cup extends ContainerDecorator{

    public Cup(IceCream icecream) {
        this.icecream = icecream;
    }

    public String getDescription() {
        return icecream.getDescription() + ", Cup";
    }

    protected int cost() {
        return icecream.cost() + cupCost;
    }
    
}
