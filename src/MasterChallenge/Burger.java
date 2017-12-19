package MasterChallenge;

public class Burger {

    private String breadRollType;
    private String meat;
    private String name;
    private double price;

    //addtional 4 attrebutes of items lettuec,tomato,carrot
    private String additionName1;
    private double additionPrice1;

    private String additionName2;
    private double additionPrice2;

    private String additionName3;
    private double additionPrice3;

    private String additionName4;
    private double additionPrice4;


    public Burger(String breadRollType, String meat, String name, double price) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.name = name;
        this.price = price;
    }


    //addtional 4 additions of items lettuec,tomato,carrot
    public void addBurgerAddition1(String name, double price)
    {
        this.additionName1 = name;
        this.additionPrice1 = price;
    }
    public void addBurgerAddition2(String name, double price)
    {
        this.additionName2 = name;
        this.additionPrice2 = price;
    }    public void addBurgerAddition3(String name, double price)
    {
        this.additionName3 = name;
        this.additionPrice3 = price;
    }    public void addBurgerAddition4(String name, double price)
    {
        this.additionName4 = name;
        this.additionPrice4 = price;
    }


    //add up price of burger with base price base of the addtions
    public double totalPrice()
    {
        //basic price of hamburger from cunstractor
        double burgerPrice = this.price;
        //basic price of burger output
        System.out.println(this.name + " is a Name of the Burger on a " + this.breadRollType + " Roll and With " +  this.meat + " meat and the price is " + this.price);

        if(this.additionName1 != null)
        {
            burgerPrice += this.additionPrice1;
            System.out.println("Added " + this.additionName1 + " For an extra " + this.additionPrice1);
        }

        if(this.additionName1 != null)
        {
            burgerPrice += this.additionPrice2;
            System.out.println("Added " + this.additionName2 + " For an extra " + this.additionPrice2);
        }

        if(this.additionName1 != null)
        {
            burgerPrice += this.additionPrice3;
            System.out.println("Added " + this.additionName3 + " For an extra " + this.additionPrice3);
        }

        if(this.additionName1 != null)
        {
            burgerPrice += this.additionPrice4;
            System.out.println("Added " + this.additionName4 + " For an extra " + this.additionPrice4);
        }


        return burgerPrice;
    }

}
