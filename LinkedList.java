public class LinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;

        }
    }
    public static Node head;
    public static Node tail;
    public void addFirst(int data)
     {
    //     // step1
         Node newNode = new Node(data);
        if(head== null)
         {
            head = tail = newNode;
           return;
        }
    //     // step2
      newNode.next = head;
       head = newNode;
     }
     public void print()
    {
        if(head == null)
        {
            System.out.println("ll is empty");
            return;
       }
        Node temp = head;
        while(temp!= null)
        {
           System.out .print(temp.data + "<<");
       temp = temp.next;
        }
        System.out.println("null");
    }
    // searching
    public int itSearch(int key)
    {
        Node temp = head;
        int i = 0;
     while(temp != null)
     {
        if(temp.data == key)
        {
            return i;
        }
        temp = temp.next;
        i++;
     }
     return -1;

    }
    public int helper(Node head , int key)
    // helper function
    {
        if(head== null)
        {
            return -1;
        }
        if(head.data == key)
        {
            return 0;
        }
        int idx = helper(head.next , key);
        if(idx == -1)
        {
            return -1;
        }
        return idx+1;


    }
    public int recSearch(int key)
    {
        return helper(head , key);
    }
    public void reverse()
    {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr!= null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public void FindNthNode(int n)
    {
        // calculate size
        int sz= 0;
        Node temp = head;
        while(temp!=null)
        {
            temp = temp.next;
            sz++;
        }
        if(sz==n)
        {
            head = head.next;
            return;
        }
        int i = 1;
        int f = sz-n;
        Node prev = head;
        while(i < f)
        {
            prev = prev.next;
            i++;

        }
        prev.next = prev.next.next;
        return;
        

        

        }
        private Node findMidNode( Node head)
        {
            Node slow = head;// +1
            Node fast = head;// +2
            while(fast!= null&& fast.next!= null)
            {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;

        }
        public boolean  checkPalindrome()
        {
            if(head == null || head.next == null)
            {
                return true;
            }
            Node mid = findMidNode(head);
            Node curr = mid;
            Node prev = null;
            while(curr!= null)
            {
                Node next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            Node right = prev;
            Node left = head;
            while(right!=null)
            {
                if(left.data!= right.data)
                {
                    return false;
                }
                left = left.next;
                right = right.next;
            }
            return true;
        }



        

    
    
    public static void main(String args[])
    {
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(3);
        ll.print();
        ll.addFirst(4);
        ll.print();
        // System.out.println(ll.recSearch(4));
        // System.out.println(ll.recSearch(2));
        // ll.reverse();
        // ll.pr/int();
        System.out.println(ll.checkPalindrome());
        
        
    }
}

    

