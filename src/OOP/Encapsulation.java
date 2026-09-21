package OOP;

public class Encapsulation {
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age >= 0) {
            this.age = age;
        }
    }
    public static void main(String[] args){
        Encapsulation s1 = new Encapsulation();
        s1.setName("Rashmi");
        s1.setAge(23);

        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
    }
}
