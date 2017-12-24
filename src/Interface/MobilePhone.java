package Interface;

public class MobilePhone implements ITelephone {

        private int myNumber;
        private boolean isRining;
        private boolean isOn;

        public MobilePhone(int myNumber)
        {
            this.myNumber = myNumber;
        }

        @Override
        public void powerOn()
        {
            isOn = true;
            System.out.println("Mobile Phone power up");
        }

        @Override
        public void dial(int phoneNumber)
        {
            if(isOn)
            {
                System.out.println(" Now rining " + phoneNumber + " on mobile phone");
            }else
            {
                    System.out.println("Phone is off");
            }
        }

        @Override
        public void answer()
        {
            if(isRining)
            {
                System.out.println("Answer the mobile phone");
            }
            isRining=false;
        }

        @Override
        public boolean callPhone(int phoneNumber)
        {
            if(phoneNumber == myNumber && isOn)
            {
                isRining = true;
                System.out.println("Melody ring");
            }
            else
            {
                System.out.println("Mobile Phone not on");
                isRining=false;
            }
            return isRining;
        }

        @Override
        public boolean isRinging()
        {
            return false;
        }
    }


