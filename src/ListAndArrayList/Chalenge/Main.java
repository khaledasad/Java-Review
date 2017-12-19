package ListAndArrayList.Chalenge;

import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static Mobile m = new Mobile("404-988-2444");

    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        printActions();
        while (!quit)
        {
            System.out.println("\nEnter Action: (6 to show availbe actions*)");
            int action = sc.nextInt();
            sc.nextLine();

            switch (action)
            {
                case 0:
                    System.out.println("\nShutDown........");
                    quit = true;
                    break;
                case 1:
                    m.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }


    }

    private static void addNewContact()
    {
        System.out.println("Enter new contact name: ");
        String name = sc.nextLine();
        System.out.println("Enter phone number ");
        String phone = sc.nextLine();

        Contact newContact = Contact.createContact(name,phone);

        if(m.addNewContact(newContact) )
        {
            System.out.println("New contact added name" +  name + " ,Phone: " + phone);
        }
        else
        {
            System.out.println("Cant added new contact, or its cuz its already in " +  name + " ,Phone: " + phone );
        }
    }


    private static void updateContact()
    {
        System.out.println("Enter Exsicting contact name:  ");
        String name = sc.nextLine();
        Contact exsistingContactRecord =  m.queryContact(name);
        if(exsistingContactRecord == null)
        {
            System.out.println("Contact not found ");
            return;
        }
        System.out.print("Enter new contact name " );
        String newName = sc.nextLine();
        System.out.println("Enter new contact phine number");
        String newNumber = sc.nextLine();

        Contact newContact = Contact.createContact(newName,newNumber);
        if(m.update(exsistingContactRecord, newContact))
        {
            System.out.println("Successfully updated record");
        }
        else
        {
            System.out.println("Error updateing");
        }

    }

    public static void removeContact()
    {
        System.out.println("Enter Exsicting contact name:  ");
        String name = sc.nextLine();
        Contact exsistingContactRecord =  m.queryContact(name);
        if(exsistingContactRecord == null)
        {
            System.out.println("Contact not found ");
            return;
        }

       if(m.removeContact(exsistingContactRecord))
       {
           System.out.println("Deleted!");
       }
        System.out.println("Error Deleteing the contact");
    }

    private static void startPhone() {
        System.out.println("Starting phone.....");
    }

    private static void queryContact()
    {
        System.out.println("Enter Exsicting contact name:  ");
        String name = sc.nextLine();
        Contact exsistingContactRecord =  m.queryContact(name);
        if(exsistingContactRecord == null)
        {
            System.out.println("Contact not found ");
            return;
        }

        System.out.println("Name " + exsistingContactRecord.getName() + " phone number is " + exsistingContactRecord.getPhoneNumber());
    }

    private static void printActions()
    {
        System.out.println("\nAvailble actions: \npress");
        System.out.println("0 - Shutdown\n" +
                           "1 - to print\n" +
                           "2 - to Add new contact\n" +
                           "3 - to Update existing contact\n" +
                           "4 - to remove exsiting contact\n" +
                           "5 - query if an exsiting contact exists\n" +
                           "6 - to print a list of availbe actions\n");
        System.out.println("Choose whats on the list");
    }

}
