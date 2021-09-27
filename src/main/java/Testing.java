public class Testing implements Tradable, Domesticatable, Drivable{
    private final int MAX_SPD = 100;
    private final int MIN_SPD = 0;
    protected int spd = 0;
    
    @Override
    public void upgradeSpeed() {
        if(spd < MAX_SPD)
            ++spd;
    }

    @Override
    public void downgradeSpeed() {
        if(spd > MIN_SPD)
            --spd;
    }

    @Override
    public int getMaxSpeed() {
        return spd;
    }

    @Override
    public String sound() {
        return "Testing Testing 123";
    }

    @Override
    public int getPrice() {
        return Integer.MAX_VALUE;
    }
}
