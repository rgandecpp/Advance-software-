package Assignment5.Q2Decorator;

public class HotDog implements MenuItem {

    public final static double COST = 3.60;

    public String getDescription() {
        return "HotDog";
    }

    public double getCost() {
        return COST;
    }
}
