public class DoWhile {

    public static void main(String[] args)
    {
//        int count =  1;
//        while(count !=6)
//        {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//        count=1;
//        do
//        {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//        while(count !=6);

//        count = 1;
//    while(true)
//        {
//            if(count == 6)
//            {
//                break;
//            }
//            System.out.println("Count value is " + count);
//            count++;
//        }

            int num = 5;
            int count = 0;
            int finishNum = 20;

            while((num <= finishNum) && count<5)
            {
                if(!isEvenNumber(num))
                {
                    num++;
                    continue;
                }
                System.out.println("Even Number " + num);
                num++;
                count++;
                System.out.println("Count" + count);
            }
        System.out.println("Count" + count);
    }
    public static boolean isEvenNumber(int num)
    {
        if((num % 2) == 0)
        {
            return true;
        }
        else
            return false;
    }
}
