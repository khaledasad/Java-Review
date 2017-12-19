package MasterChallenge;

public class DeluxeBurger extends Burger {

    public DeluxeBurger() {
        super("White Bread", "Beef", "Deluxe", 4.25);
        super.addBurgerAddition1("Chips", 1.4);
        super.addBurgerAddition2("Drink", 1.00);
    }

    @Override
    public void addBurgerAddition1(String name, double price) {
        System.out.println("Cant addtional items to Deluxe burger");
    }

    @Override
    public void addBurgerAddition2(String name, double price) {
        System.out.println("Cant addtional items to Deluxe burger");
    }

    @Override
    public void addBurgerAddition3(String name, double price) {
        System.out.println("Cant addtional items to Deluxe burger");
    }

    @Override
    public void addBurgerAddition4(String name, double price) {
        System.out.println("Cant addtional items to Deluxe burger");
    }
}
