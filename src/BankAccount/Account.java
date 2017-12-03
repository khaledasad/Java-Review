package BankAccount;

public class Account {

    private int accNum;
    private int balance;
    private String name;
    private String email;
    private int phoneNum;

    public Account()
    {
        this(2222,10000,"Maja", "nemam@email.necu", 404221111);
        System.out.println("Empty constractor");
    }

    public Account(int accNum, int balance, String name, String email, int phoneNum)
    {
      System.out.println("Account Constractor Info");
      this.accNum= accNum;
      this.balance= balance;
      this.name= name;
      this.email=email;
      this.phoneNum=phoneNum;
    }

    public Account(String name, String email, int phoneNum) {
        this(8888, 100, name, email,phoneNum);
        //no noeed u passed em up in this statment
//        this.name = name;
//        this.email = email;
//        this.phoneNum = phoneNum;
    }

    public int getAccNum() {
        return accNum;
    }

    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void deposit(int depositAmount)
    {
        this.balance = depositAmount + balance;
        System.out.println("Current Blance:" + this.balance);
    }

    public void withdraw(int withdrawAmount)
    {
        if(this.balance >= withdrawAmount)
        {
            this.balance = this.balance - withdrawAmount;
            System.out.println("Current Balance: " + this.balance);
        }
        else
            System.out.println("Insufficent funds, this is ur balance: " + this.balance);

    }

}

