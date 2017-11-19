public class SwicthCase {

    public static void main(String[] args)
    {
        int value = 1;
        if(value == 1 )
        {
            System.out.println("Value was 1");
        }
        else if(value == 2)
        {
            System.out.println("Value was 2");
        }
        else
        {
            System.out.println("Value is not 1 or 2");
        }


        int swicthValue = 1;
        switch (swicthValue)
        {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
            case 3: case 4: case 5:
                System.out.println("was a 3, or 4, or 5");
                System.out.println("Actuall it was  a " + swicthValue);
                break;
            default:
                System.out.println("Was not 1 or 2");
        }


        char charValue = 'K';

        switch (charValue)
        {
            case 'A':
                System.out.println("A");
                break;
            case 'B':
                System.out.println("B");
                break;
            case 'C':
                System.out.println("C");
                break;
            case 'D':
                System.out.println("D");
                break;
            case 'E':
                System.out.println("E");
                break;
            default:
                System.out.println("Its not one of the letters");

        }




    }
}
