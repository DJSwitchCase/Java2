package Decorator;

public class ChocolateBar implements Chocolate {

    @Override
    public int getCost() {
        return 50;
    }

    @Override
    public String getIngredients() {
        return "Chocolate";
    }
}
