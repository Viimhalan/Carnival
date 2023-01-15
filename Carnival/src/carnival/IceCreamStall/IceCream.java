package carnival.IceCreamStall;

public abstract class IceCream {
    protected String description;
    protected final int scoopCost = 4;
    protected abstract int cost();

    public String getDescription() {
        return description;
    }
    
}
