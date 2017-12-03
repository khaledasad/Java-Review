package Inherate.Chalange;

public class Main {

    public static void main (String[] args)
    {

        DB9 am = new DB9 (24);
        am.steer(20);
        am.accelerate(20);
        am.accelerate(30);

        String str = "Hai i am SAP";
        for(int i = str.length() - 1; i >= 0;  i--)
            System.out.print(str.charAt(i));
        System.out.println();



    }
}
