package Decorator;

public class ChocolateBarWithNuts extends Decorator{
    public ChocolateBarWithNuts(ChocolateBar chocolateBar) {
        super(chocolateBar);
    }

    @Override
    public int getCost() {
        return super.getCost() + 20;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", nuts";
    }
}
