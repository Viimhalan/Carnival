package carnival.IceCreamStall;

public class Sprinkles extends ToppingDecorator{
    
    public Sprinkles(IceCream icecream) {
        this.icecream = icecream;
    }

    public String getDescription() {
        return icecream.getDescription() + ", Sprinkles";
    }

    public int cost() {
        return icecream.cost() + dryToppingCost;
    }
    
}
