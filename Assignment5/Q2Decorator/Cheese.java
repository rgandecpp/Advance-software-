package Assignment5.Q2Decorator;

public class Cheese extends ToppingDecorator {
    public static final double COST = 0.5;
    public Cheese(MenuItem newMenuItem) {
        super(newMenuItem);
    }

    public String getDescription() {
        return menuItem.getDescription() + ", Cheese";
    }

    public double getCost() {
        return menuItem.getCost() + COST;
    }
}
