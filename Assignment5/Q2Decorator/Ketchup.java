package Assignment5.Q2Decorator;

public class Ketchup extends ToppingDecorator {
    public static final double COST = 0.20;
    public Ketchup(MenuItem newMenuItem) {
        super(newMenuItem);
    }

    public String getDescription() {
        return menuItem.getDescription() + ", Ketchup";
    }

    public double getCost() {
        return menuItem.getCost() + COST;
    }
}
