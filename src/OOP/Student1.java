package OOP;
// Mini Project Student Management System
public class Student1 {
    private String name;
    private int rollNo;
    private String course;

    public Student1(String name, int rollNo, String course){
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
    }
    public  String getName(){
        return name;
    }
    public int getRollNo(){
        return rollNo;
    }
    public String getCourse(){
        return course;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }
    public void setCourse(String course){
        this.course = course;
    }

    public void display(){
        System.out.println(rollNo + "|" + name + "|" + course);
    }
    public static void main(String[] args){
        Student1 student1 = new Student1("Rashmi", 101, "Java");
        Student1 student2 = new Student1("Chethan", 6 , "Full Stack");

        student1.display();
        student2.display();
    }
}
