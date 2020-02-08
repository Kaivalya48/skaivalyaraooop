interface in{
    void name(String n);
    void balance(int bal);
    void rateofinterest(int bal);
}
class Sbi implements in{
    
    public void name(String n){
        System.out.println("WELCOME TO SBI BANK ");
        System.out.println("Hi "+ n);
    }
    public void balance(int bal){
        System.out.println("ACOOUNT BALANCE IS "+ bal);
    }
    public void rateofinterest(int bal){
        System.out.println("RATE OF INTEREST IS "+ (0.06*bal));
    }
    
    
}
class Icici implements in{
    
    public void name(String n){
        System.out.println("*******************************");
        System.out.println("WELCOME TO ICICI BANK ");
        System.out.println("Hi "+ n);
    }
    public void balance(int bal){
        System.out.println("ACOOUNT BALANCE IS "+ bal);
    }
    public void rateofinterest(int bal){
        System.out.println("RATE OF INTEREST IS "+ (0.04*bal));
    }
    
    
}
public class Test{
    public static void main(String args[]){
        Sbi a=new Sbi();
        a.name("Satya");
        a.balance(5000);
        a.rateofinterest(5000);
        Icici b=new Icici();
        b.name("SAi");
        b.balance(5000);
        b.rateofinterest(5000);
        
    }
}
