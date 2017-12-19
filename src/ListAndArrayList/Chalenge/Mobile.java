package ListAndArrayList.Chalenge;

import java.util.ArrayList;

public class Mobile {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public Mobile(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }


    public boolean addNewContact(Contact contact)
    {
        if(findContact(contact.getName()) >= 0)
        {
            System.out.println("Contact is already on file ");
            return false;
        }

        myContacts.add(contact);
        return true;
    }

    public boolean update(Contact oldContact, Contact newContact)
    {
        int foundPostion = findContact(oldContact);
        if(foundPostion < 0)
        {
            System.out.println(oldContact.getName() + " Was not found");
            return false;
        }

        this.myContacts.set(foundPostion, newContact);
        System.out.println(oldContact.getName() + " , was replaced with " + newContact.getName());
        return true;

    }

    public boolean removeContact(Contact contact)
    {
        int foundPostion = findContact(contact);
        if(foundPostion < 0)
        {
            System.out.println(contact.getName() + " Was not found");
            return false;
        }

        this.myContacts.remove(foundPostion);
        System.out.println(contact.getName() + " ,Was deleted ");
        return true;
    }

    private int findContact(Contact contact)
    {
        return this.myContacts.indexOf(contact);
    }

    //checking if the name matches
    private int findContact(String contactName)
    {
        for(int i = 0; i < this.myContacts.size(); i++)
        {
            Contact contact = this.myContacts.get(i);
            if(contact.getName().equals(contactName))
            {
                return i;
            }
        }
        //was not found
        return -1;
    }

    //return Name using findContact method
    public String queryContact(Contact contact)
    {
        if(findContact(contact) >= 0)
        {
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name)
    {
        int position = findContact(name);
        if(position >=0)
        {
            return this.myContacts.get(position);
        }
        return null;
    }

    public void printContacts()
    {
        for(int i=0; i<this.myContacts.size(); i++)
        {
            System.out.println(i+1 + ". " + this.myContacts.get(i).getName()+ " -> " +
                                            this.myContacts.get(i).getPhoneNumber());
        }
    }
}
