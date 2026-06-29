


class BankAccount
{
    @SuppressWarnings("FieldMayBeFinal")
    private String name;
    private double balance;

    public BankAccount(String name) {
        this.name=name;
        this.balance=0.0;
    }
    void deposit(double amount)
    {
        if(amount<=0)
        {
            System.out.println("Invalid");
            return;
        }
        balance +=amount;
        System.out.println("Deposit:"+amount);
    }
    void withdraw(double amount)
    {
        if(amount<=0||amount>balance)
        {
            System.out.println("Invalid");
            return;
        }
        balance -=amount;
        System.out.println("Deposit:"+amount);
    }
    void checkBalance()
    {
        System.out.println(name+"'s balance:"+balance);

    }

}
public class BankSystem {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        BankAccount acc=new BankAccount("Nihad");
        acc.deposit(1000);
        acc.withdraw(300);
        acc.checkBalance();
        acc.deposit(-50);
        acc.withdraw(800);
        
    }
    
}
