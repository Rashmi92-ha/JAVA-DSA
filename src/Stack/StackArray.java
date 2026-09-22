package Stack;

public class StackArray {
    int[] stack;
    int top = -1;
    StackArray(int size){
        stack = new int[size];
    }

    boolean push(int value){
        if(top == stack.length -1) {
            return false;
        }
            top++;
            stack[top] = value;
            return true;
    }

    Integer pop(){
        if(top == -1){
            return null;
        }
        int value = stack[top];
        top--;
        return value;
    }

    Integer peek(){
        if(top == -1){
            return null;
        }
        return stack[top];
    }

    boolean isEmpty(){
        return top == -1;
    }
    void display(){
        for(int i=top ; i>= 0 ; i--){
            System.out.print(stack[i] + " ");
        }
    }
    public static void main(String[] args){
     StackArray stack = new StackArray(5);
    System.out.println(stack.push(10));
    System.out.println(stack.push(20));
    System.out.println(stack.push(30));
    System.out.println(stack.pop());
    System.out.println(stack.peek());
    System.out.println(stack.isEmpty());
    stack.display();
    }
}
