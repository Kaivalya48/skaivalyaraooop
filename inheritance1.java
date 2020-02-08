class Bank{
    void rateofinterest(double amount){
        double rate;
        if(amount<=500){
            rate=(0.02)*amount;
            System.out.println("RATE OF INTEREST IS " + rate);
        }
        else if(amount<=1000 && amount>0){
            rate=(0.04)*amount;
            System.out.println("RATE OF INTEREST IS " + rate);
        }
        else if(amount<=5000 && amount>1000){
            rate=(0.05)*amount;
            System.out.println("RATE OF INTEREST IS " + rate);
        }
        else if(amount>=5000){
            rate=(0.06)*amount;
            System.out.println("RATE OF INTEREST IS " + rate);
        }                
    }
}
class Sbi extends Bank{
    void name(String user){
        System.out.println("HI "+ user);
        System.out.println("WELCOME To SBI BANK");
    }
    void bal(int balance){
        
        System.out.println("YOUR ACCOUNT BALANCE IS " + balance);
    } 
}
public class Test{
    public static void main(String args[]){
        Sbi a=new Sbi();
        a.name("SAi");
        a.bal(5000);
        a.rateofinterest(5000);
    }
}