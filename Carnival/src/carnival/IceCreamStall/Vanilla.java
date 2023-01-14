package carnival.IceCreamStall;

public class Vanilla extends IceCream{

    public Vanilla() {
        description = "Madagascar Vanilla";
    }

    protected int cost() {
        return scoopCost;
    }
    
}
