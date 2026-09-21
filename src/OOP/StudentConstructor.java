package OOP;

public class StudentConstructor {
    String name;
    int rollno;
    StudentConstructor(){
        this("unknown", 0);
    }
    StudentConstructor(String name , int rollno){
        this.name = name;
        this.rollno = rollno;
    }
    public static void main(String[] args){
        StudentConstructor s1 = new StudentConstructor();
        StudentConstructor s2 = new StudentConstructor("Rashmi" , 32);

        System.out.println("Student1: " + s1.name + " " + s1.rollno);
        System.out.println("Student2: " + s2.name + " " + s2.rollno);
    }
}
