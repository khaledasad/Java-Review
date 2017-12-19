package AutoBoxAndUnboxing.Chalange;

public class Main {

    public static void main(String[] args)
    {
        Bank b = new Bank ("Bank of America"); //goes to only Bank to create a bank
        b.addBranch("Georgia"); // creates branch using branch constarctor
        // BANK addcustomer()--> if branch esxisits --> then create customer and add amount based on Customer constractor
        b.addCustomer("Georgia", "Khaled", 100.00); // if only the branch matches/exsists then create name and amount
        b.addCustomer("Georgia", "Anissa", 150.00);
        b.addCustomer("Georgia", "Marija", 250.00);



        b.addBranch("Zagreb");
        b.addCustomer("Zagreb", "Zeljka", 50.00);

        b.addCustomerTransaction("Georgia", "Khaled", 20);
        b.addCustomerTransaction("Georgia", "Marija", 20);
        b.addCustomerTransaction("Georgia", "Anissa", 20);


        b.ListCustomers("Georgia",true);
        b.ListCustomers("Zagreb",true);

        b.addBranch("Rome");

        if(!b.addCustomer("Rome", "Tom", 5.53))
        {
            System.out.println("Rome does not excsist");
        }
    }

}
