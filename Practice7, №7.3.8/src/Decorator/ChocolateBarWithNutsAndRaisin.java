package Decorator;

public class ChocolateBarWithNutsAndRaisin extends Decorator{
    public ChocolateBarWithNutsAndRaisin(Chocolate chocolateBar) {
        super(chocolateBar);
    }

    @Override
    public int getCost() {
        return super.getCost() + 10;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients()+", raisin";
    }
}
