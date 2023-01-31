package carnival.IceCreamStall;

public class ChocolateSauce extends ToppingDecorator{
    
    public ChocolateSauce(IceCream icecream) {
        this.icecream = icecream;
    }

    public String getDescription() {
        return icecream.getDescription() + ", Chocolate Sauce";
    }

    public int cost() {
        return icecream.cost() + dryToppingCost;
    }
    
}
