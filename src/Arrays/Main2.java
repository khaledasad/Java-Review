package Arrays;

import java.util.Scanner;

public class Main2 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        int[] myIntegers = getIntegers(5);

        for(int i = 0; i < myIntegers.length; i++)
        {
            System.out.println("Element " + i + " , typed values was " + myIntegers[i]);
        }


        System.out.println("AVG of array is " + getAvg(myIntegers));




    }

    public static int[] getIntegers(int number)
    {
        System.out.println("Enter " + number + " number Value. \r");
        int[] values = new int[number];

        for (int i = 0; i <values.length; i++)
        {
            values[i] = scanner.nextInt();
            System.out.println("Element " + i + " , typed values was " + values[i]);
        }

        return values;
    }




    public static double getAvg(int[] array)
    {
        int sum = 0;

        for(int i = 0; i < array.length; i++ )
        {
            sum += array[i];
        }
              //(double) sum / (double) array.length
        return sum/array.length;


    }
}
