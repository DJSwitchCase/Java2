package Decorator;

public class Decorator implements Chocolate{
    private Chocolate chocolate;

    public Decorator(Chocolate chocolateBar) {
        this.chocolate = chocolateBar;
    }

    @Override
    public int getCost() {
        return chocolate.getCost();
    }

    @Override
    public String getIngredients() {
        return chocolate.getIngredients();
    }
}
