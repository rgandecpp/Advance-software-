package Assignment5.Q2Decorator;

public class MainDriver {
    public static void main(String[] args){
        showMenu();
        Order customerOrder1 = new Order("#1");
        customerOrder1.addItem(new Cheese(new VeganBurger()));
        customerOrder1.addItem(new SoftDrink("Medium"));
        customerOrder1.receipt();

        //Same order with Loyal(VIP) Customer
        Order customerOrder2 = new Order("#2", "VIP");
        customerOrder2.addItem(new Cheese(new VeganBurger()));
        customerOrder2.addItem(new SoftDrink("Medium"));
        customerOrder2.receipt();

        Order customerOrder3 = new Order("#3", "VIP");
        customerOrder3.addItem(new Ketchup(new Fries()));
        customerOrder3.addItem(new Cheese(new Fries()));
        customerOrder3.receipt();

        Order customerOrder4 = new Order("#4");
        customerOrder4.addItem(new Cheese(new Mayo(new HotDog())));
        customerOrder4.receipt();
    }

    public static void showMenu(){
        System.out.println("\nWelcome to BurgerKing!");
        System.out.println("-------- Main Menu -------");
        System.out.printf("\tVeganBurger: $%.2f%n", VeganBurger.COST);
        System.out.printf("\tHotDog: $%.2f%n", HotDog.COST);
        System.out.printf("\tFries: $%.2f%n", Fries.COST);
        System.out.println("----------- Add-on Options ----------");
        System.out.printf("\tCheese : $%.2f%n", Cheese.COST);
        System.out.printf("\tKetchup : $%.2f%n", Ketchup.COST);
        System.out.printf("\tMayo: $%.2f%n", Mayo.COST);
        System.out.println("------------ Drinks Menu ------------");
        System.out.println("Soft Drink: \n\t$1.00 (Small) \n\t$1.25 (Medium) \n\t$1.50 (Large)");
        System.out.println("--- Discount for Customer Loyalty ---");
        System.out.println("\tVIP: 5%");
    }
}
