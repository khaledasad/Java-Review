public class Methods {

    public static void main(String[] args){

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;


//        if(gameOver)
//        {
//            int finalScore = score + (levelCompleted * bonus);
//            finalScore += 1000;
//            System.out.println("Your Final score was " + finalScore);
//        }

        int highScore = calculateScore(true, score, levelCompleted,bonus);
        System.out.println("Your Final score was " + highScore);

//        score = 10000;
//        levelCompleted = 8;
//        bonus = 200;

        highScore = calculateScore(true,10000,8,200);
        System.out.println("Your Final score was " + highScore);

//
//        if(gameOver)
//        {
//            int finalScore = score + (levelCompleted * bonus);
//            System.out.println("Your final score was " + finalScore);
//        }
//

        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Khaled",position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("Khaled",position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("Khaled",position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition("Khaled",position);



   }
//
//    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus)
//    {
//        //not needed due to paramters that are passed in in method
////        boolean gameOver = true;
////        int score = 800;
////        int levelCompleted = 5;
////        int bonus = 100;
//
//        if(gameOver)
//        {
//            int finalScore = score + (levelCompleted * bonus);
//            finalScore += 2000;
//            System.out.println("Your Final score was " + finalScore);
//        }
//    }


    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus)
    {
        //not needed due to paramters that are passed in in method
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;


        if(gameOver)
        {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
//            System.out.println("Your Final score was " + finalScore);
            return finalScore;
        }
        else
        {
         return -1;
        }

    }

    public static void displayHighScorePosition(String playerName, int position)
    {
        System.out.println(playerName + " Manged to get into postion " + position);
    }

    public static int calculateHighScorePosition(int score)
    {
//        if(score >= 1000)
//        {
//            System.out.println("First Place");
//        }
//        else if (score >=500 &&  score <=1000)
//        {
//            System.out.println("Second Place");
//        }
//        else if (score >=100 && score <=1500)
//        {
//            System.out.println("Third Place");
//        }
//        else
//            System.out.println("Fourth place");
//
//        return score;

        if(score >= 1000)
        return 1;

        else if (score >=500 &&  score <=1000)
        return 2;

        else if (score >=100 && score <=1500)
        return 3;

        else
        return 4;

    }




}
