package BankAccount;

public class Main {

    public static void main(String[] args)
    {
//        Account Khaled = new Account();
//        Khaled.deposit(1000);
//        Khaled.withdraw(500);
//        Khaled.withdraw(500);
//        Khaled.withdraw(500);

       Account k = new Account(122227, 1000, "Anissa", "emial@email.com", 40002323);
       System.out.println(k.getAccNum());
       Account nonthing = new Account();
       System.out.println(nonthing.getAccNum());

        Account donky = new Account("Ello", "asdjasdhflhsdksjd",2000000);
        System.out.println(donky.getAccNum());
        System.out.println(donky.getName());

        VipCustomer special = new VipCustomer();
        VipCustomer special1 = new VipCustomer("Asad", 1111, "sadadd");
        VipCustomer special2 = new VipCustomer("Khaled", "asdasdasdasd");
        System.out.println(special.getName());
        System.out.println(special1.getName());
        System.out.println(special2.getName());
    }

}
