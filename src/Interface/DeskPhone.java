package Interface;

public class DeskPhone implements ITelephone {

    private int myNumber;
    private boolean isRining;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No action taken, desk phone does not have a power button");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println(" Now rining " + phoneNumber + " on deskphone");
    }

    @Override
    public void answer() {
        if(isRining)
        {
            System.out.println("Answer the desk phone");
        }
        isRining=false;
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber ==myNumber)
        {
            isRining = true;
            System.out.println("ring ring");
        }
        else
        {
            isRining=false;
        }
        return isRining;
    }

    @Override
    public boolean isRinging() {
        return false;
    }
}
