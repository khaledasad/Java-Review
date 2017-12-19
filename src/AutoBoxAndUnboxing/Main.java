package AutoBoxAndUnboxing;

import java.util.ArrayList;
import java.lang.reflect.Array;


class intClass{
    private int myValue;

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }

    public intClass(int myValue) {
        this.myValue = myValue;

    }
}

public class Main {
    public static void main(String[] args)
    {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Khaled");

        ArrayList<intClass> intClassArraList = new ArrayList<intClass>();
        intClassArraList.add(new intClass(54));

        //Wrapper INTIGER= Class
        Integer integer = new Integer(54);
        Double doubleValue = new Double(11.22);

        ArrayList<Integer> intArrayList =  new ArrayList<Integer>();

        for(int i=0; i<=10; i++)
        {
            //autoboxing primitive type to class
            //unboxing class to pritive type
            intArrayList.add(Integer.valueOf(i));
        }

        for(int i=0; i<=10; i++)
        {
            System.out.println(i + " --> " + intArrayList.get(i).intValue());
        }



        Integer myIntValue = 56; // at complie time --> Integer.valueOf(56)
        int myInt = myIntValue; // --> myInt.intValue();

        ArrayList<Double> doubleArrayList =  new ArrayList<Double>();



        for(double dbl = 0.0; dbl<=10.0; dbl += 0.5)
        {
            doubleArrayList.add(Double.valueOf(dbl));
        }

        for(int i = 0; i < doubleArrayList.size(); i++)
        {
            double value = doubleArrayList.get(i).doubleValue(); //--> it would work with out doubleValue//but thst what Java is douing
            System.out.println(i + " --> " + value);
        }

    }

}
