class Sbi{
    
    void display(String user,int balance){
        System.out.println("****************************");
        System.out.println("HI "+ user);
        System.out.println("WELCOME TO SBI BANK");
        System.out.println("YOUR ACCOUNT BALANCE IS " + balance);
        System.out.println("THANK YOU FOR USING SBI BANK");
        System.out.println("****************************");
        
    }
    void display(String user,int balance,int withdraw){
        
        System.out.println("HI "+ user);
        System.out.println("WELCOME To SBI BANK");
        System.out.println("YOUR WITHDRAWN AMOUNT IS " + withdraw);
        System.out.println("YOUR TOTAL BALANCE AMOUNT IS " + (balance-withdraw));
        System.out.println("THANKS FOR USING SBI BANK");
        System.out.println("****************************");
        
    }
    
}
public class Test{
    public static void main(String args[]){
        Sbi a=new Sbi();
        a.display("Satya",5000);
        a.display("Satya",5000,2000);
        
    }
}
