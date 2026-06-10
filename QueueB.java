import java.util.*;
public class QueueB {
    static class Queue{
        static Stack <Integer> s1= new Stack<>();
        static Stack <Integer> s2 = new Stack<>();
        public static boolean isEmpty()
        {
            return s1.isEmpty();
        }
        public static void add(int data)
        {
            while(! s1. isEmpty())
            {
                s2.push(s1.pop());

                

                

            }
            s1.push(data);
            while(!s2.isEmpty())
            {
                s1.push(s2.pop());
            }
        }
        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("queue empty");
                return -1;
            }
            return s1.pop();
        }
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("queue empty");
                return -1;
            }
            return s1.peek();
        }
    }
    // static class Node{
    //     int data;
    //     Node next;
    //     Node(int data)
    //     {
    //         this.data = data;
    //         this.next = null;
    //     }
    // }
    // static class Queue{
    //     static Node head = null;
    //     static Node tail = null;
    //     public static boolean isEmpty()
    //     {
    //         return head== null && tail == null;
    //     }
    //     public static void add(int data)
    //     {
    //         Node newNode = new Node(data);
    //         if(head== null){
    //             head= tail=newNode;
    //             return;
    //         }
    //         tail.next = newNode;
    //         tail = newNode;
    //     }
    //     public static int remove()
    //     {
    //         if(isEmpty())
    //         {
    //             System.out.println("empty queue");
    //             return -1;
    //         }
    //         int front = head.data;
    //         if(tail == head)
    //         {
    //             tail = head= null;
    //         }
    //         else{
    //             head = head.next;
    //         }
    //         return front;
    //     }
    //     public static int peek()
    //     {
    //         if(isEmpty())
    //         {
    //             System.out.println("empty queue");
    //             return -1;
    //         }
    //         return head.data;
    //     }
        

    // }
    public static void main(String args[])
    {
            Queue q= new Queue();
            q.add(1);
            q.add(2);
            q.add(3);
            while(!q.isEmpty())
            {
                System.out.println(q.peek());
                q.remove();
            }

    }
    
}
