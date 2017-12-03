package CompostionV2;

public class Main {

    public static void main(String[] args)
    {

        Wall w1 = new Wall("West");
        Wall w2 = new Wall("East");
        Wall w3 = new Wall("North");
        Wall w4 = new Wall("South");

        Ceiling c1 =new Ceiling(5, "White");

        Bed b = new Bed("regular", 2, 1,2,2);

        Lamp l = new Lamp("Glass", true, 22);

        Room r = new Room("BedRoom", w1,w2,w3,w4,c1,b,l);

        //Room.java-->makeBed();
        r.makeBed();
        //Room.java-->Lamp.java-->turnOn();
        r.getLamp().turnOn();

        r.getHouse().roomCount();



    }


}
