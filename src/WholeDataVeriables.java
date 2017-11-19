public class WholeDataVeriables {

    public static void main (String[] args){

        System.out.println("Testing");
        int myNum = 4;
        System.out.println(myNum);

        //min -2_147_483_648 max 2_147_483_647
        int large = 2_222_222_22;

        //min -128 max 127
        byte myByte = 10;
        //cast to know its byte
        byte newByte = (byte)(myByte / 2);

        //min-32768 max -32767
        short myShorty = 3288;
        short newShorty = (short) (myShorty / 2);
        //min max DOUBLE of INT
        long longy = 100L;

        //Whole Number Interaction
        byte byteyEx = 10;
        short shortNew = 20;
        int intnew = 50;
        long longEx = 50_000L + 10 * (byteyEx + shortNew + intnew);
        System.out.println(longEx);






    }


}
