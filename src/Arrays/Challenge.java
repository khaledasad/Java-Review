package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Challenge {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {

        int[] myInt = getInt(10);

        int[] sorted = sort(myInt);
        printArray(sorted);

    }


    //returning array int[]
    public static int[] getInt(int capacity)
    {
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values: \r");

        for(int i = 0; i < array.length; i++)
        {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    //when getting if from array you do (int[] array*)
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Elemnt " + i + " Contents " + array[i]);
        }
    }
    //int array = unsorted integers
    public static int[] sort(int[] array)
    {
//        int[] sortedArray = new int[array.length];
//    //copy array
//        for(int i  = 0; i < array.length;i++)
//        {
//            sortedArray[i] = array[i];
//        }
        // the array passing in and how many chracaters
        int[] sortedArray = Arrays.copyOf(array,array.length);

        boolean flag = true;
        int temp;

        while(flag)
        {
            flag =false;
            //erasing last element
            for(int i = 0; i<sortedArray.length-1;i++)
            {
                //looking at values and if the second elemnt value is bigger than previus procesd ONLY IF TRUE
                //   0=11               1=12
                if(sortedArray[i] < sortedArray[i + 1])
                {
                    //if yes, then store it
                    // new 0=11   <=   0=11
                    temp = sortedArray[i];
                    //now that i+1 postion is swaped back to sortedArray (0=11 VS 1=12 Element)
                    // new 1=12          <=    1=12
                    sortedArray[i] = sortedArray[i + 1];

                    //now assigning that veriable to temp
                    //11               <= new 11
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
