package Collections_;

import Collections_.MyStack;

public class Main {
    public static void main(String[] args) {
        int[] keys = { 1, 2, 3, 4, 5 };

        MyStack<Integer> s = new MyStack<Integer>();
        for (int key: keys) {
            s.push(key);
        }

       System.out.println( s.search(1));

        System.out.println("FrontMiddleBackQueue");
        FrontMiddleBackQueue<Integer> q=new FrontMiddleBackQueue<Integer>();

        while (!q.isEmpty()){
            System.out.println(q.popFront());
        }



    }
}
