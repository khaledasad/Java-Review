package InnerClasses;

import MasterChallenge.Burger;

import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static Button buttonPrint = new Button("Print");
    public static void main(String[] args) {

        GearBox bmw = new GearBox(6);
        //////////////////////////////////////////
        //inner class
//        GearBox first = BMW .new Gear(1, 12.3);
//        System.out.println(first.driveSpeed(1000));
        //VS

//        bmw.addGear(1, 5.0);
//        bmw.addGear(2, 12.6);
//        bmw.addGear(3, 15.7);
//
//        bmw.operateClitch(true);
//        bmw.chnageGear(1);
//        bmw.operateClitch(false);
//        System.out.println(bmw.wheelSpeed(1000));
//        bmw.chnageGear(2);
//        System.out.println(bmw.wheelSpeed(3000));
//        bmw.operateClitch(true);
//        bmw.chnageGear(3);
//        bmw.operateClitch(false);
//        System.out.println(bmw.wheelSpeed(6000));

        /////////////////////////////////////////////
        //interface

//        class ClickListener implements Button.OnClickListener
//        {
//            public ClickListener()
//            {
//                System.out.println("Ive been Attached");
//            }
//
//            @Override
//            public void onClick(String title) {
//                System.out.println(title + " was clicked");
//            }
//        }
//
//        buttonPrint.setOnClickListener(new ClickListener());


        /////////////////////////////////////////////////////////
        //anaonimus class
        buttonPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });




        listen();


    }

    private static void listen()
    {
        boolean quit = false;
        while(!quit)
        {
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice)
            {
                case 0:
                    quit=true;
                    break;
                case 1:
                    buttonPrint.onClick();
                    break;
            }

        }
    }
}
