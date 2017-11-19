public class JavaOverload {

    public static void main(String[] args){

        int newScore = calculateScore("Asad",400);
        System.out.println("New Score " + newScore);

        //Second Method Overloading
        //meaning two methods but 2 diff paramaters
        calculateScore(200);

        //calcFeetAndInchesToCent(6.0,0.0);
        double cm = calcFeetAndInchesToCent(6,0);
        if(cm < 0.0)
        {
            System.out.println("Invalid Parameter");
        }
        calcFeetAndInchesToCent(100);

    }

    public static int calculateScore(String playerName, int score)
    {
        System.out.println("Player " + playerName + " Score " + score);
        return score * 1000;

    }

    public static int calculateScore(int score)
    {
        System.out.println("No-Name" + " Score " + score);
        return score * 1000;

    }

    public static int calculateScore()
    {
        System.out.println("No Player name or Score");
        return 0;

    }

    public static double  calcFeetAndInchesToCent(double feet, double inches)
    {
      if((feet <0) || ((inches <0) || (inches >12)))
      {
          System.out.println("Please enter valid Value");
          return -1;
      }
      double cm = (feet * 12) * 2.54;
      cm += inches * 2.54;
      System.out.println(feet + " feet " + inches + " Inches " + cm + " cm");
      return cm;

    }

    public static double calcFeetAndInchesToCent(double inches)
    {
        if(inches < 0)
        {
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println("Inches: " + inches + " Feet " + feet + "Remaining Inches " + remainingInches);
        return calcFeetAndInchesToCent(feet,remainingInches);
    }




}
