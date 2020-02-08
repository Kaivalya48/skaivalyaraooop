abstract class Bank{
    abstract void balance();
    abstract void rateofinterest();
    void thanks(){
        System.out.println("Thank you for using our bank");
    }
}
class Sbi extends Bank{
    void balance(){
        System.out.println("Balance: 3000");
    }
    void rateofinterest(){
        System.out.println("Rate of interest is 1.5 % ");
    }
}
class Axis extends Bank{
    void balance(){
        System.out.println("Balance: 45000");
    }
    void rateofinterest(){
        System.out.println("Rate of interest is 8 % ");
    }
}
public class Demo{
    public static void main(String args[]){
        Bank a;
        a=new Sbi();
        a.balance();
        a.rateofinterest();
        a.thanks();
        a=new Axis();
        a.balance();
        a.rateofinterest();
        a.thanks();
    }
}
