public class Sheep implements Tradable, Domesticatable {

    @Override
    public String sound() {
        return "Bahh!";
    }

    @Override
    public int getPrice() {
        return 5;
    }

}
