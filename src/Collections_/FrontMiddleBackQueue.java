package Collections_;

import java.util.LinkedList;
import java.util.Queue;
/*
public class FrontMiddleBackQueue<T> {

    private java.util.Queue<T> queue1,queue2;

    public void  FrontMiddleBackQueue(){
        queue1=new LinkedList<T>();
        queue2=new LinkedList<T>();


    }

    public void pushFront(T element){
        while (!queue1.isEmpty()){
            queue2.add(queue1.peek());
            queue1.poll();
        }
        queue1.add(element);
        while(!queue2.isEmpty()){
            queue1.add(queue2.peek());
            queue2.poll();
        }
    }

    public void pushBack(T element){
        queue1.add(element);
    }
    public void pushMiddle(T element){
        int size=Math.round(queue1.size()/2);
        while(queue1.size()!=size){
            queue2.add(queue1.poll());
        }
        queue1.add(element);
        while(!queue2.isEmpty()){
            queue1.add(queue2.poll());
        }
    }

    public T popFront(){
        return queue1.poll();
    }

    public T popBack(){

    }


    public Object popMiddle(){
        int size=Math.round(queue1.size()/2);
        while(queue1.size()!=size){
            queue2.add(queue1.poll());
        }
        Object element_=queue1.poll();
        while(!queue2.isEmpty()){
            queue1.add(queue2.poll());
        }
        return element_;
    }



}
*/

public class FrontMiddleBackQueue<T> {
    private Queue<T> queue1,queue2;


    public FrontMiddleBackQueue(){
        queue1=new LinkedList<T>();
        queue2=new LinkedList<T>();


    }

    public void pushFront(T data){
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

    public void pushMiddle(T data){
        int size=Math.round(queue1.size()/2);
        queue2.add(data);
        while(queue1.size()!=size){
            queue2.add(queue1.poll());
        }

        while(!queue2.isEmpty()){
            queue1.add(queue2.poll());
        }
    }

    public void pushBack(T data){
        queue1.add(data);
    }

    public T popFront(){
        if (queue1.isEmpty())
        {
            System.out.println("Underflow!!");
            System.exit(0);
        }
        T front = queue1.peek();
        queue1.poll();

        return front;
    }

    public T popBack(){
        while (!queue1.isEmpty()){
            queue2.add(queue1.peek());
            queue1.poll();
        }
        T back= queue1.poll();
        while(!queue2.isEmpty()){
            queue1.add(queue2.peek());
            queue2.poll();
        }
        return back;
    }


    public T peekFront(){
        if (queue1.isEmpty())
        {
            System.out.println("Underflow!!");
            System.exit(0);
        }
        T front = queue1.peek();
        return front;
    }
    
    public T peekBack(){
        while (!queue1.isEmpty()){
            queue2.add(queue1.peek());
            queue1.poll();
        }
        T back= queue1.peek();
        while(!queue2.isEmpty()){
            queue1.add(queue2.peek());
            queue2.poll();
        }
        return back;
    }




    public boolean isEmpty(){
        return queue1.isEmpty();
    }



}
