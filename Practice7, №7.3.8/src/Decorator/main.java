package Decorator;

public class main {
    public static void main(String[] args) {
        Chocolate chocolateBar = new ChocolateBar();
        System.out.println("Cost: "+chocolateBar.getCost() + " Ingredients: "+chocolateBar.getIngredients());

        Chocolate chocolateBarNuts = new ChocolateBarWithNuts(new ChocolateBar());
        System.out.println("Cost: "+chocolateBarNuts.getCost() + " Ingredients: "+chocolateBarNuts.getIngredients());

        Chocolate chocolateBarRaisin = new ChocolateBarWithNutsAndRaisin(new ChocolateBarWithNuts(new ChocolateBar()));
        System.out.println("Cost: "+chocolateBarRaisin.getCost() + " Ingredients: "+chocolateBarRaisin.getIngredients());


    }
}
