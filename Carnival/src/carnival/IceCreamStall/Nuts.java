package carnival.IceCreamStall;

public class Nuts extends ToppingDecorator{

    public Nuts(IceCream icecream) {
        this.icecream = icecream;
    }

    public String getDescription() {
        return icecream.getDescription() + ", Nuts";
    }

    public int cost() {
        return icecream.cost() + dryToppingCost;
    }
  
}
