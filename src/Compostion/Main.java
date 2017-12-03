package Compostion;

public class Main {

    public static void main (String[] args)
    {
        Dimensions dimensions = new Dimensions(20, 33, 15);
        Case theCase = new Case("232A", "HP", "333", dimensions);


        Monitor monitor = new Monitor("55inch Screen","Toshiba", 55, new Resolution(2150, 1440));

        MontherBoard montherBoard = new MontherBoard("Z-150", "MSI", 4,5,"V245");


        PC thePC = new PC(theCase,monitor,montherBoard);

        thePC.powerUp();
//        thePC.getMonitors().drawPixelAt(2000,1500,"Red");
//        thePC.getMontherBoard().loadProgram("Windowds 10");
//        thePC.getTheCase().pressPowerButton();

    }
}
