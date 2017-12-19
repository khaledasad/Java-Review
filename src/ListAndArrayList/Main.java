package ListAndArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

        private static Scanner sc = new Scanner(System.in);
        private static GorceryList groceryList = new GorceryList();
    public static void main(String[] args)
    {
          boolean quit =false;
          int chocie = 0;
          printInstractions();
          while(!quit) {
              System.out.println("Enter your Choice ");
              chocie = sc.nextInt();
              sc.nextLine();

              switch (chocie) {
                  case 0:
                      printInstractions();
                      break;
                  case 1:
                      groceryList.printGroceryList();
                      break;
                  case 2:
                      addItem();
                      break;
                  case 3:
                      modifyItem();
                      break;
                  case 4:
                      removeItem();
                      break;
                  case 5:
                      searchForItem();
                      break;
                  case 6:
                      processArrayList();
                  case 7:
                      quit = true;
                      break;

                             }
                      }
    }


    public static void printInstractions()
    {
        System.out.println("\t 0 - Print choice option");
        System.out.println("\t  1 - Print List ");
        System.out.println("\t  2 - Add");
        System.out.println("\t  3 - Modify an item in the list");
        System.out.println("\t  4 - Remove");
        System.out.println("\t  5 - Sreach for an item");
        System.out.println("\t  6 - quit ");
    }

    public static void addItem()
    {
        System.out.print("Please enter a grocery Item ");
        groceryList.addGorceryItems(sc.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Current Item Name ");
        String itemNo = sc.nextLine();
        sc.nextLine();

        System.out.println("Enter replacemnet item");
        String newItem = sc.nextLine();
        groceryList.modifyGroceryItem(itemNo, newItem);

    }

    public static void removeItem()
    {
        System.out.print("Please enter item name  ");
        String itemNo = sc.nextLine();
        sc.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }

    public static void searchForItem()
    {
        System.out.println("Enter item to sreach for ");
        String sreachItem = sc.nextLine();

        if(groceryList.onFile(sreachItem))
        {
            System.out.println("Found it " + sreachItem);
        }
        else
        {
            System.out.println(sreachItem + " not found");
        }
    }

    //copy array list
    public static void processArrayList()
    {
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());

        //vs
       // ArrayList<String> newArray = new ArrayList<String>(groceryList.getGroceryList());

        String[] myArray = new String[groceryList.getGroceryList().size()];

        myArray = groceryList.getGroceryList().toArray(myArray);

    }


}
