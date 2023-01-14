package carnival.IceCreamStall;

public class Chocolate extends IceCream{

    public Chocolate() {
        description = "Belgian Chocolate";
    }

    protected int cost() {
        return scoopCost;
    }
    
}
