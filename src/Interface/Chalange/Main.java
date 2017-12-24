package Interface.Chalange;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Player k = new Player("Khaled", 22, 22);
        System.out.println(k.toString());
        saveObject(k);

        k.setHitPoints(10);
        k.setStrength(12);
        k.setName("Khaleeeeda");
        saveObject(k);
        //loadObject(k); // here ud run the 1vs0 options
        System.out.println(k);



        ISaveable m = new Monster("Anissa", 100,100);
        System.out.println("Strength " + ((Monster) m).getStrength());
       // System.out.println(m);
        saveObject(m);





    }

    public static List<String> readValues() {
        List<String> values = new ArrayList<String>();

        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.println("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = sc.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }

        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave)
    {
        for(int i = 0; i<objectToSave.write().size(); i++)
        {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject (ISaveable objectToLoad)
    {
        List<String> values = readValues();
        objectToLoad.read(values);
    }
}



