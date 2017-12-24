package InnerClasses;

import java.util.ArrayList;

public class GearBox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;
    private boolean clutchIsIn;


    public GearBox(int maxGears)
    {
        this.gears = new ArrayList<>();
        this.maxGears = maxGears;
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);

//        for(int i = 0; i< maxGears; i++)
//        {
//           addGear(i, i * 5.0);
//        }
    }

    public void addGear (int number, double ratio)
    {
        if((number > 0 )&& (number <= maxGears))
        {
            this.gears.add(new Gear(number, ratio));
        }
    }

    public void chnageGear(int newGear)
    {
        if((newGear > 0) && (newGear < this.gears.size()) && this.clutchIsIn)
        {
            this.currentGear = newGear;
            System.out.println("Gear " + newGear + " Selected ");
        }
        else
        {
            System.out.println("Blown Engine");
            this.currentGear = 0;
        }
    }

    public double wheelSpeed(int revs)
    {
        if(clutchIsIn)
        {
            System.out.println("Scream!!!");
            return 0.0;
        }
        else
            return revs * gears.get(currentGear).getRatio();
    }


    public void operateClitch(boolean in)
    {
        this.clutchIsIn = in;
    }



    private class Gear{

        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio)
        {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double driveSpeed(int revs){
            return revs*(this.ratio);
        }

        public double getRatio() {
            return ratio;
        }
    }


}
