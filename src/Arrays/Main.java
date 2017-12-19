package Arrays;

public class Main {

    public static void main(String[] args) {
        //Mutiple values with single data type is an Array
        // holds 5 veriables
        int[] myIntArray = new int[5];

        //value 30 saving to element 4
        //hint 0 ==> 5 total 6 elemnts
        myIntArray[2] = 30;
        myIntArray[1] = 20;
        myIntArray[0] = 10;
        myIntArray[3] = 40;
        myIntArray[4] = 50;
        System.out.println(myIntArray[2]);

        //VS1

        double[] myDdoubleArray = {1, 2, 3, 4, 5};
        System.out.println(myDdoubleArray[2]);


        //VS2

        int[] myIntArray2 = new int[10];

        //it will look ahead and stop at the end of the array vs set by user
        for (int i = 0; i < myIntArray2.length; i++)
        {
            myIntArray2[i] = i * 10;
            System.out.println("Element " + i + " Value " + myIntArray2[i]);
        }

        printArray(myIntArray2);


    }

       //VS3
    public static void printArray(int[] array)
    {
        for(int i = 0; i<array.length; i++)
        {
            System.out.println("Element on " + i + " Value of " + array[i]);
        }
    }


}


