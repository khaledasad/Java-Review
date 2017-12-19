package LinkList;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {

        Customer c = new Customer("Khaled", 40.00);
        Customer anotherCustomer;

        anotherCustomer = c;
        anotherCustomer.setBalance(12.10);

        System.out.println("Balance for customer " + c.getName() + " is " + c.getBalance());

        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(2);
        intList.add(3);

        for(int i = 0; i < intList.size(); i++)
        {
            System.out.println(i + ": " + intList.get(i));
        }

        intList.add(1,2);


        for(int i = 0; i < intList.size(); i++)
        {
            System.out.println(i + ": " + intList.get(i));
        }

    }

}
