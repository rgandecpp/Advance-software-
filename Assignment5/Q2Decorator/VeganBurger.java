package Assignment5.Q2Decorator;

public class VeganBurger implements MenuItem{

    public final static double COST = 2.50;

    public String getDescription() {
        return "VeganBurger";
    }

    public double getCost() {
        return COST;
    }
}
