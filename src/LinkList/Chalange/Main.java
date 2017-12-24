package LinkList.Chalange;

import java.util.*;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<Album>();
    public static void main(String[] args) {


        Album a = new Album("New Devison", "The New Devison");

        a.addSong("CopyCat", 3.44);
        a.addSong("Do tell", 2.4);
        a.addSong("Move on ", 1.33);
        a.addSong("I have no idea", 4.33);
        a.addSong("OK", 4.55);
        a.addSong("Poatato", 2.33);
        a.addSong("Tomato", 5.67);
        a.addSong("Apples", 2.35);
        albums.add(a);

        a = new Album("Rossavelt", "Moving");
        a.addSong("Moving Potato", 3.2);
        a.addSong("Cool", 3.2);
        a.addSong("Beans", 3.2);
        a.addSong("Manisha", 3.2);
        albums.add(a);


        LinkedList<Song> playList  = new LinkedList<Song>();

        //ArrayList.get(Album).addToPlayList(Text/index , to new Playlist LinkedList)

        //0 is first album New Devision
        albums.get(0).addToPlayList("Do tell",playList);
        albums.get(0).addToPlayList("OK",playList);
        albums.get(0).addToPlayList("Apples",playList);
        albums.get(0).addToPlayList("CopyCat",playList);
        albums.get(0).addToPlayList(5,playList);

        //1 is the second array list album songs starting "Rossavelt"
        albums.get(1).addToPlayList(55,playList);
        albums.get(1).addToPlayList("Potatos",playList);
        albums.get(1).addToPlayList(3,playList);



        play(playList);




    }

    private static void play(LinkedList<Song> playList)
    {
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> listIterator = playList.listIterator();

        if(playList.size() == 0)
        {
            System.out.println("No song is in play list");
            return;
        }
        else
        {
            //here you are calling the ToString!
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while(!quit)
        {
            int action =sc.nextInt();
            sc.nextLine();

            switch (action)
            {
                case 0:
                    System.out.println("Play list cpmplete ");
                    quit = true;
                    break;
                case 1:
                    //first it look ahead if there is somthing
                    if(!forward)
                    {
                        if(listIterator.hasNext())
                        {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    //if yes then print
                    if(listIterator.hasNext())
                    {
                        System.out.println("Now playing " + listIterator.next().toString());
                    }
                    //else its end
                    else
                    {
                        System.out.println("you have reached end of the play list");
                        forward = false;
                    }
                     break;
                case 2:
                    if(forward)
                    {
                        if(listIterator.hasPrevious())
                        {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious())
                    {
                        System.out.println("Now Playing " + listIterator.previous().toString());
                    }
                    else
                    {
                        System.out.println("You are at the begging of the play list");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward)
                    {
                        if(listIterator.hasPrevious())
                        {
                            System.out.println("Replaying<- " + listIterator.previous().toString());
                            forward=false;
                        }
                        else
                        {
                            System.out.println("We are at the start of the list ");
                        }
                    }
                    else
                    {
                        if(listIterator.hasNext())
                        {
                            System.out.println("Replaying-> " + listIterator.next().toString());
                            forward=true;
                        }
                        else
                        {
                            System.out.println("We are at the end of the list ");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playList.size()> 0)
                    {
                        listIterator.remove();
                        if(listIterator.hasNext())
                        {
                            System.out.println("Now Playing " + listIterator.next());
                        }
                        else if(listIterator.hasPrevious())
                        {
                            System.out.println("Now playing " + listIterator.previous());
                        }
                        break;
                    }

            }
        }

    }

    private static void printMenu()
    {
        System.out.println("Availble actions:\npress");

        System.out.println("0 - to quit\n" +
                          "1 - to play next song\n"+
                          "2 - to play prevous song\n"+
                          "3 - to relay the current song\n"+
                          "4 - list songs in the play list \n"+
                          "5 - Menu print\n" +
                          "6 - Delete song"
        );
    }


    private static void printList(LinkedList<Song> playList)
    {
        Iterator<Song> iterator = playList.iterator();

        System.out.println("===============================================");
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        System.out.println("===============================================");
    }


}
