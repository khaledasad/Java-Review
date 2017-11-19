public class ForLooping {


    public static void main (String[] args)
    {
        System.out.println("10,000 at 2% interest: " + calcInterest(10_000.0, 2.0));
        System.out.println("10,000 at 2% interest: " + calcInterest(10_000.0, 3.0));
        System.out.println("10,000 at 2% interest: " + calcInterest(10_000.0, 4.0));
        System.out.println("10,000 at 2% interest: " + calcInterest(10_000.0, 5.0));

        for(int i = 0; i<5; i++)
        {
            System.out.println("Loop " + i + " Test");
        }

        for(int j = 2; j < 9; j++)
        {
           // calcInterest(10000,2);
            System.out.println("10,000 at "+ j +" interest: " + String.format("%.2f",calcInterest(10_000.0, j)));
        }

        System.out.println("********************************************");
        for(int j = 8; j > 1; j--)
        {
            // calcInterest(10000,2);
            System.out.println("10,000 at "+ j +" interest: " + String.format("%.2f",calcInterest(10_000.0, j)));
        }




        int count  = 0;
        for (int i =10; i<50; i++)
        {
            if(isPrime(i))
            {
                count++;
                System.out.println("Number " + i + " is Prime Number");

                if(count == 3) {
                    System.out.println("Exiting for Loop");
                    break;
                }
            }
        }





        }
        public static double calcInterest(double amount, double interestRate)
        {
            return(amount * (interestRate / 100));
        }


        public static boolean isPrime(int n)
        {
            if(n == 1)
            {
                return false;
            }

            for(int i=2; i<= n/2; i++)
            {
                if(n % i == 0)
                {
                    return false;
                }
            }
            return true;
        }




}
