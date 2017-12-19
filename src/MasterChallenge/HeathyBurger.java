package MasterChallenge;

public class HeathyBurger extends Burger {

    private String heathyChoiceName1;
    private double heathyChoicePrice1;

    private String heathyChoiceName2;
    private double heathyChoicePrice2;


    public HeathyBurger(String meat, double price) {
        super("Brown Bread", meat, "Healthy Burger", price);

    }

    public void addHealthAddition1(String name, double price)
    {
        this.heathyChoiceName1 = name;
        this.heathyChoicePrice1 = price;
    }

    public void addHealthAddition2(String name, double price)
    {
        this.heathyChoiceName2 = name;
        this.heathyChoicePrice2 = price;
    }


    @Override
    public double totalPrice() {
        //apply same priciple like in superclass Burger
        double burgerPrice = super.totalPrice();

        if(this.heathyChoiceName1 != null)
        {
            burgerPrice += this.heathyChoicePrice1;
            System.out.println("Added " + this.heathyChoiceName1 + " for an extra " + this.heathyChoicePrice1);
        }

        if(this.heathyChoiceName2 != null)
        {
            burgerPrice += this.heathyChoicePrice2;
            System.out.println("Added " + this.heathyChoiceName2 + " for an extra " + this.heathyChoicePrice2);
        }
        return burgerPrice;
    }
}
