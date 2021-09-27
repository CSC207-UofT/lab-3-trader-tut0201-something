public class Sheep implements Tradable, Domesticatable {

    public Sheep() {}
    
    @Override
    public String sound() {
        return "Bahh!";
    }

    @Override
    public int getPrice() {
        return 5;
    }

}
