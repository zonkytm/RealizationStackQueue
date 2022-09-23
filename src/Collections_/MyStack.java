package Collections_;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack<T> {
    private Queue<T> queue1,queue2;


    public MyStack(){
        queue1=new LinkedList<T>();
        queue2=new LinkedList<T>();


    }

    public void push(T data){
        while (!queue1.isEmpty()){
            queue2.add(queue1.peek());
            queue1.poll();
        }
        queue1.add(data);
        while(!queue2.isEmpty()){
            queue1.add(queue2.peek());
            queue2.poll();
        }
    }

    public T pop(){
        if (queue1.isEmpty())
            {
                System.out.println("Underflow!!");
                System.exit(0);
            }
            T front = queue1.peek();
            queue1.poll();

            return front;
        }


    public T top(){
        if (queue1.isEmpty())
        {
            System.out.println("Underflow!!");
            System.exit(0);
        }
        T front = queue1.peek();
        return front;
    }


    public boolean isEmpty(){
        return queue1.isEmpty();
    }

    public Integer search(T element){
        Integer index= (Integer) 0;
        while (!queue1.isEmpty()){
            if (!queue1.peek().equals(element)){
                index++;
                queue2.add(queue1.peek());
                queue1.poll();
            }
            else{
                break;

            }
        }
        return index;
    }

}
