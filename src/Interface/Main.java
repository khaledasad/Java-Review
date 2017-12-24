package Interface;

public class Main {
    public static void main(String[] args) {

        ITelephone khaledsPhone;
        khaledsPhone = new DeskPhone(4444444);

        khaledsPhone.powerOn();
        khaledsPhone.callPhone(4444444);
        khaledsPhone.answer();



        khaledsPhone = new MobilePhone(22222);
        khaledsPhone.powerOn();
        khaledsPhone.callPhone(22222);
        khaledsPhone.answer();



    }
}
