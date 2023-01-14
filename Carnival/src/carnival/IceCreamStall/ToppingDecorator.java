package carnival.IceCreamStall;

public abstract class ToppingDecorator extends IceCream{
    
    IceCream icecream;
    protected final int dryToppingCost = 1;
    protected final int sauceCost = 2;
    public abstract String getDescription();
    
}
