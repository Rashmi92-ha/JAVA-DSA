package OOP;

abstract class Animal{
    abstract void sound();
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog Barks");
    }
}
public class Abstract {
    public static void main(String[] args){
        Animal a = new Dog();
        a.sound();
    }
}
