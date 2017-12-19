package Encapsulation.Chalange;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;


    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel > -1 && tonerLevel <=100) {
            this.tonerLevel = tonerLevel;
        }
        else
        {
            this.tonerLevel = -1;
        }

        this.duplex = duplex;
        this.pagesPrinted = 0;
    }


    public int refill(int tonerAdded)
    {
        //grater than 0 and less than 100
        if(tonerLevel > 0 && tonerLevel <= 100)
        {
            //grater than 100
         if(this.tonerLevel + tonerAdded > 100)
         {
             //throw
             return -1;
         }
         //done right and print outcome
         this.tonerLevel += tonerAdded;
         return this.tonerLevel;
        }
        else
        {
            //return int value -1 if it throws error
            return -1;
        }
    }


    public int printPage(int pages)
    {
        int pagesToPrint = pages;

        // pages that are dublepages
        if(this.duplex){
            pagesToPrint /= 2;
        }
        System.out.println("Printing Double Pages " );

        //Update Pages that are printed
        this.pagesPrinted +=pagesToPrint;
        //return count
        return pagesToPrint;
    }

    //get # of pages printed
    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }
}
