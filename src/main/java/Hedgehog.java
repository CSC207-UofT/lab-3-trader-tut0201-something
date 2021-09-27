public class Hedgehog implements Tradable, Domesticatable {

    public String name;
    private int price;

    /**
     * Initialize the class Hedgehog and set its name and price
     * @param name: the name for the hedgehog
     * @param price: the price for the hedgehog
     **/
    public Hedgehog(String name, int price) {
        this.name = name;
        this.price = price;
    }

    /**
     * getPrice() returns the price for the given instance of a hedgehog
     * @return the price for the hedgehog
     */
    public int getPrice() {
        return price;
    }

    /**
     * Returns the sound made by the hedgehog. Not really sure what sounds hedgehogs make
     * @return a string representing the sound of a hedgehog
     */
    public String sound() {
        return "Squeal!";
    }


}
