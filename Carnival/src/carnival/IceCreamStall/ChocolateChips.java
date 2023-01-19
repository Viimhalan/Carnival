package carnival.IceCreamStall;

public class ChocolateChips extends ToppingDecorator{

    public ChocolateChips(IceCream icecream) {
        this.icecream = icecream;
    }

    public String getDescription() {
        return icecream.getDescription() + ", Chocolate Chips";
    }

    public int cost() {
        return icecream.cost() + dryToppingCost;
    }
  
}
