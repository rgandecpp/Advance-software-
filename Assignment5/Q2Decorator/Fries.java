package Assignment5.Q2Decorator;

public class Fries implements MenuItem{

    public final static double COST = 1.9;

    public String getDescription() {
        return "Fries";
    }

    public double getCost() {
        return COST;
    }
}
