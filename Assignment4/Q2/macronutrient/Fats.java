package Assignment4.Q2.macronutrient;

public class Fats implements Macronutrient {
    private String name;

    public Fats(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Fats: " + name;
    }
}
