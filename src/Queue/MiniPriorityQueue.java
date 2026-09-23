package Queue;
import java.util.PriorityQueue;
import java.util.Collections;
public class MiniPriorityQueue {
    static class employee{
        String name;
        int salary;
        employee(String name, int salary){
            this.name = name;
            this.salary = salary;
        }
    }
    public static void main(String[] args){
        PriorityQueue<Integer> priority = new PriorityQueue<>();
        PriorityQueue<employee> pq = new PriorityQueue<>((e1, e2) -> e1.salary - e2.salary);
        PriorityQueue<employee> maxPriority = new PriorityQueue<>((e1,e2) -> e2.salary - e1.salary);
        priority.add(10);
        priority.add(20);
        priority.add(30);
        priority.add(40);
        System.out.println("Peeked: " + priority.peek());
        while (!priority.isEmpty()){
            System.out.println(priority.poll());
        }
        pq.add(new employee("Rashmi" ,5000));
        pq.add(new employee("Anu", 4000));
        pq.add(new employee("shami", 3000));
        while (!pq.isEmpty()){
            employee emp = pq.poll();
            System.out.println("Minpriority: " + emp.name + " - " + emp.salary);
        }

        maxPriority.add(new employee("Naruto" , 2000));
        maxPriority.add(new employee("hinata" , 50000));
        maxPriority.add(new employee("sakura" , 1000));
        while(!maxPriority.isEmpty()){
            employee emp = maxPriority.poll();
            System.out.println("MaxPriority: " +  emp.name + " - " + emp.salary);
        }
    }
}
