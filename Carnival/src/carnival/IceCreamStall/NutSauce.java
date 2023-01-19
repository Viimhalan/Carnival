package carnival.IceCreamStall;

public class NutSauce extends ToppingDecorator{
    
    public NutSauce(IceCream icecream) {
        this.icecream = icecream;
    }

    public String getDescription() {
        return icecream.getDescription() + ", Nut Sauce";
    }

   public int cost() {
        return icecream.cost() + dryToppingCost;
    }
    
}
