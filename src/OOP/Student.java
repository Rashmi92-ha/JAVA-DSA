package OOP;
public class Student {
        String name;
        int rollno;

        public static void main(String[] args){
            Student s1 = new Student();
            s1.name = "Rashmi";
            s1.rollno = 32;

            System.out.println("Name: " + s1.name);
            System.out.println("Roll no:" + s1.rollno);

        }
}
