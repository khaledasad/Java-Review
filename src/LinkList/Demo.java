package LinkList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        LinkedList<String> placesToVisit = new LinkedList<String>();

        addInOrder(placesToVisit,"NoviGrad");
        addInOrder(placesToVisit,"Moscow");
        addInOrder(placesToVisit,"Gaza");
        addInOrder(placesToVisit,"TelAviv");
        addInOrder(placesToVisit,"New York");
        addInOrder(placesToVisit,"Suwanee");
        addInOrder(placesToVisit,"Buford");
        printList(placesToVisit);


//        placesToVisit.add("Belgrade");
//        printList(placesToVisit);
//        placesToVisit.add("Zagreb");
//        placesToVisit.add("Lazarevac");
//        placesToVisit.add("Gracac");
//        placesToVisit.add("Stepojevac");
//        placesToVisit.add("Donji Srb");

//        printList(placesToVisit);
//
//        placesToVisit.add(1,"Zadar");
//        printList(placesToVisit);
//
//        placesToVisit.remove(4);
//        printList(placesToVisit);

    }

    private static void printList(LinkedList<String> linkedList)
    {
        Iterator<String> i = linkedList.iterator();
                //is there another entry
        while(i.hasNext())
        {                                           //i++
            System.out.println("Now visiting : " + i.next());
        }
        System.out.println("=============================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity)
    {
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while(stringListIterator.hasNext())
        {

            int compare = stringListIterator.next().compareTo(newCity);

            //if equal do not add
            if(compare == 0)
            {
                System.out.println(newCity + " is already included as a destination");
                return false;
            }
            else if (compare > 0)
            {
                //new city should apear before the value already in
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }
            else if(compare < 0) {
                //move on next city
            }
        }

        stringListIterator.add(newCity);
        return true;
    }


    private static void viisit(LinkedList cities)
    {
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;

        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty())
        {
            System.out.println("No cities in on list");
        }
        else
        {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while(!quit)
        {
            int action = sc.nextInt();
            sc.nextLine();

            switch (action)
            {
                case 0:
                    System.out.println("Holiday over");
                    quit = false;
                    break;
                case 1:
                    if(!goingForward)
                    {
                        if (listIterator.hasNext())
                        {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasPrevious())
                    {
                        System.out.println("Now visisting " + listIterator.next());
                    }
                    else
                    {
                        System.out.println("Reach the end of the List");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward)
                    {
                        if(listIterator.hasPrevious())
                        {
                            listIterator.previous();
                        }
                        goingForward= false;
                    }
                    if(listIterator.hasPrevious())
                    {
                        System.out.println("Now visiting " + listIterator.previous());
                    }
                    else
                    {
                        System.out.println("We are at the start");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }


        }
    }

        private static  void printMenu()
        {
            System.out.println("Available actions");
            System.out.println("0 - to quit\n" +
                               "1 - Go to next city\n" +
                               "2 - Go to Previous\n" +
                               "3 - Print Menu\n"

            );
        }


}
