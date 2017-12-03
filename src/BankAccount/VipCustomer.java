package BankAccount;

public class VipCustomer {

    private String name;
    private int credit;
    private String email;


    public VipCustomer() {
        this("Regualr ", 500, "Email");
    }

    public VipCustomer(String name, String email) {
        this(name,123, email);
    }

    public VipCustomer(String name, int credit, String email) {
        this.name = name;
        this.credit = credit;
        this.email = email;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getCredit() {
        return credit;
    }

    public String getEmail() {
        return email;
    }
}
