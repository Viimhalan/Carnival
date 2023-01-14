package carnival.IceCreamStall;

public abstract class ContainerDecorator extends IceCream{
    
    IceCream icecream;
    protected final int cupCost = 2;
    protected final int coneCost = 1;
    public abstract String getDescription();
    
}
