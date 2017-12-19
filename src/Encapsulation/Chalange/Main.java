package Encapsulation.Chalange;

public class Main {

    public static void main (String [] args)
    {
        Printer p1 = new Printer(75,false);

        System.out.println("Inital Page count: " + p1.getPagesPrinted());

        int pagesPrinted = p1.printPage(4);

        System.out.println("Pages Printed: " + pagesPrinted);
        System.out.println("Total Pages printed " + p1.getPagesPrinted());
        System.out.println("Ink Level " + p1.getTonerLevel());

        System.out.println("=====================================================");
        pagesPrinted = p1.printPage(2);
        System.out.println("Pages Printed: " + pagesPrinted);
        System.out.println("Total Pages printed " + p1.getPagesPrinted());
        System.out.println("Ink Level " + p1.getTonerLevel());

    }


}
