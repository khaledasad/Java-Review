public class Operators {


    public static void main (String[] args)
    {
        int sum = 1 + 2;

        boolean isScary = false;
        if(isScary == true)
        {
            System.out.println("SCARY!!!");
        }
        else
        {
            System.out.println("-.- not Scary");
        }

        int topScore = 100;
        // if(topScore <= 100)
        // if(topScore >= 100)
        // if(topScore != 100)
        // if(topScore == 100)
        // if(topScore < 100)
        // if(topScore > 100)
        // + - * / && || etc


        if(topScore != 100)
        {
            System.out.println("NO!!");
        }
        else
        {
            System.out.println("NICE!");
        }

        boolean isCar = false;
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar)
            System.out.println("Wasac is true ");



        //EX
        double mDouble =20d;
        double myDouble = 80d;
        double sums = (mDouble + myDouble) * 25;

        double remainder = sums % 40;
        System.out.println(remainder);

        if(remainder <= 20)
        {
            System.out.println("TOTAL WAS OVER LIMIT");
        }





    }
}
