package ListAndArrayList;

import java.util.ArrayList;

public class GorceryList {
    //private int[]myNumber;
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGorceryItems(String item)
    {
        groceryList.add(item);

    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    //print the list
    public void printGroceryList()
    {
        System.out.println("Gorcery List " + groceryList.size() + " Items");

        for(int i = 0; i < groceryList.size(); i++)
        {
            //so it starts from 1 index
            System.out.println((i + 1)+ ". " + groceryList.get(i));
        }

    }

    public void modifyGroceryItem(String currentItem, String newItem)
    {
        int postion = findItem(currentItem);
        if(postion >= 0)
        {
            modifyGroceryItem(postion,newItem);
        }
    }

    //modify the list
    public void modifyGroceryItem(int postion, String newItem)
    {
        groceryList.set(postion,newItem);
        System.out.println("Grocery Item " + (postion + 1) + " has been modifed");
    }

    public void removeGroceryItem(String item)
    {
        int postion = findItem(item);
        if(postion >= 0)
        {
            remove(postion);
        }
    }

    //delete from list
    private void remove(int postion)
    {
       // String theItem =  groceryList.get(postion);
        groceryList.remove(postion);
    }

    //find item
    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);

         //boolean exists = groceryList.contains(searchItem);

//        //index is passed in to set the index of postion
//        int position = groceryList.indexOf(searchItem);
//
//        //if index is >= 0 get it
//        if (position >= 0)
//        {
//            return groceryList.get(position);
//        }
//        return null;
//    }
    }


    public boolean onFile( String searchItem)
    {
        int postion = findItem(searchItem);

        if(postion >= 0)
        {
            return true;
        }
        return false;
    }






}













