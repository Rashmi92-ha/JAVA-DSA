package OOP;

class Payment{
    void pay(){
        System.out.println("Making payment");
    }
}
class UpiPayment extends Payment{
    @Override
    void pay(){
        System.out.println("Making UPI Payments");
    }
}
class CardPayment extends Payment{
    @Override
    void pay(){
        System.out.println("Making Card Payment");
    }
}
public class polymorphism {
    public static void main(String[] argsS ){
        Payment p;

        p= new UpiPayment();
        p.pay();

        p= new CardPayment();
        p.pay();
    }
}
