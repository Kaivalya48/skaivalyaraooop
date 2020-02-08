class Sbi{
    private int account_number;
    private int balance;
    void information(int d,int a)
    {
        account_number=d;
        balance=a;
        System.out.println("WELCOME TO SBI BANK");
        System.out.println("ACCOUNT NUMBER :"+ account_number);
        System.out.println("ACCOUNT BALANCE :"+ balance);
    }
    void deposit(int a)
    {
        
        System.out.println("AFTER DEPOSIT");
        System.out.println("TOTAL ACCOUNT BALANCE :"+ (a+balance));
        
    }
}
public class Bank{
    public static void main(String args[]){
        Sbi s=new Sbi();
        s.information(5,600);
        s.deposit(1000);
    }
}
