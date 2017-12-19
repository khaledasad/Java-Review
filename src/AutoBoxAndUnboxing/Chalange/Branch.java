package AutoBoxAndUnboxing.Chalange;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;


    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initalAmount) {
        //if not found then go create one
        if (findCustomer(customerName) == null)
        {
            this.customers.add(new Customer(customerName, initalAmount));
            //secessfull added a customer
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount)
    {
        //check if this object exisists
        Customer excsitingCustomer = findCustomer(customerName);
        //if not then add transaction and amount as paramaeter
        if(excsitingCustomer != null)
        {
            excsitingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName)
    {
        for(int i = 0; i < this.customers.size(); i++)
        {
            Customer checkedCustomer = this.customers.get(i);
            if(checkedCustomer.getName().equals(customerName))
            {
                return checkedCustomer;
            }
        }
        return null;
    }


}
