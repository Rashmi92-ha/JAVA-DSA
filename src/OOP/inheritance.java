package OOP;

class Employee {
    String name;
    int salary;

    void work1() {
        System.out.println("Employee is working");
    }
}

class Developer extends Employee {
    @Override
    void work1(){
        System.out.println("Developer is coding");
    }
}
class TeamLead extends Developer{
    void work2(){
        System.out.println("TeamLead is working");
    }
}

public class inheritance {
    public static void main(String[] args) {
        Developer d = new Developer();
        d.name = "Rashmi";
        d.salary = 15000;
        TeamLead t = new TeamLead();
        t.name = "Antara";
        t.salary = 4500;
        System.out.println("Name: " + d.name);
        System.out.println("Salary: " + d.salary);
        d.work1();

        System.out.println("Name: " + t.name);
        System.out.println("Salary: " + t.salary);
        t.work2();
    }
}
