package carnival.IceCreamStall;

public abstract class IceCream {
    protected String description;
    protected final int scoopCost = 2;
    protected abstract int cost();

    public String getDescription() {
        return description;
    }
    
}
