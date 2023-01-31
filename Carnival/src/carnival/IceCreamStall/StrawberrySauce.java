package carnival.IceCreamStall;

public class StrawberrySauce extends ToppingDecorator{
    
    public StrawberrySauce(IceCream icecream) {
        this.icecream = icecream;
    }

    public String getDescription() {
        return icecream.getDescription() + ", Strawberry Sauce";
    }

    public int cost() {
        return icecream.cost() + dryToppingCost;
    }
    
}
