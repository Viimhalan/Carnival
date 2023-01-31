package carnival.IceCreamStall;

public class Strawberry extends IceCream{

    public Strawberry() {
        description = "Berry Strawberry";
    }

    protected int cost() {
        return scoopCost;
    }
    
}
