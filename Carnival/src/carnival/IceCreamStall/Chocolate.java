package carnival.IceCreamStall;

public class Chocolate extends IceCream{

    public Chocolate() {
        description = "Belgian Chocolate";
    }

    public int cost() {
        return scoopCost;
    }
    
}
