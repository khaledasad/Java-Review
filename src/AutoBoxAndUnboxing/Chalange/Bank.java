package AutoBoxAndUnboxing.Chalange;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName)
    {
        if(findBranch(branchName) == null)
        {
            this.branches.add(new Branch (branchName));
        }

        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount)
    {
        //find branch if it matches
        Branch b = findBranch(branchName);

        // if it exists then create a newcustomer with a name and amount
        if(b != null)
        {
            return b.newCustomer(customerName, initialAmount);
        }

        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount)
    {
        Branch b = findBranch(branchName);
        if(b != null)
        {
            return b.addCustomerTransaction(customerName, amount);
        }
        return false;
    }

    private Branch findBranch(String branchName)
    {
        for(int i = 0; i < this.branches.size(); i++)
        {
            //Get branch in Array list
            Branch checkedBranches= this.branches.get(i);
            //if the paramter name and already exstisting branch mach return the branch
            //get the name for that i
            if(checkedBranches.getName().equals(branchName))
            {
                return checkedBranches;
            }
        }
        return null;
    }


    public boolean ListCustomers(String branchName, boolean shwTransaction)
    {
        Branch b = findBranch(branchName);
        if(b !=null)
        {
            System.out.println("Customers details for branch " + b.getName());

            ArrayList<Customer> branchCustomers = b.getCustomers();

            //getting list of all customers
            for(int i = 0; i < branchCustomers.size(); i++)
            {
                Customer bC = branchCustomers.get(i);
                System.out.println("Customer : " + bC.getName() + "[" + (i+1) + "]");
                //if true to show list all transactions for a customer
                if(shwTransaction)
                {
                    System.out.println("Transactions " );
                    ArrayList<Double> transactions = bC.getTransactions();
                    for(int j = 0; j<transactions.size(); j++)
                    {
                        System.out.println("[" + (j+1) + "] Amount" + transactions.get(j));
                    }
                }
            }
            return true;
        }
        else
        {
            return false;
        }
    }





















}
