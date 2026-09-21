package OOP;

interface Payment1{
    void pay();
}
class Upi implements Payment1{
    @Override
    public void pay(){
        System.out.println("Payment through UPI");
    }
}
public class Interface {
    public static void main(String[] args){
        Payment1 s = new Upi();
        s.pay();
    }
}
