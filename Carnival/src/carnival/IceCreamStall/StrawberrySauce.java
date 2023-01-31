package carnival.IceCreamStall;

public class StrawberrySauce extends ToppingDecorator{
    
    public StrawberrySauce(IceCream icecream) {
        this.icecream = icecream;
    }

    public String getDescription() {
        return icecream.getDescription() + ", Strawberry Sauce";
    }

    protected int cost() {
        return icecream.cost() + dryToppingCost;
    }
    
}
