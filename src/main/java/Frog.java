public class Frog implements Tradable, Domesticatable {
    private boolean var_one;

    public Frog() {
        this.var_one = true;
    }

    @Override
    public String sound() {
        return "Ribbit";
    }

    @Override
    public int getPrice() {
        return 3;
    }

    public String isHappy() {
        String to_return;
        if (var_one) {
            to_return = "The frog is happy! But now you've poked him and he's sad.";
        } else {
            to_return = "The frog is sad. But now he's feeling a bit better.";
        }
        this.var_one = !var_one;
        return to_return;
    }
}
