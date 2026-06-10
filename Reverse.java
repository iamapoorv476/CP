public class Reverse {
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
    private Node getMid(Node head)
    {
        Node slow = head;
        Node fast = head.next;
        while(fast!= null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;
    }
    private Node merge(Node head1, Node head2)
    {
        Node mergedLL= new Node(-1);
        Node temp = mergedLL;
        while(head1 != null && head2!= null)
        {
            if(head1.data<= head2.data)
            {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else{
                temp.next = head2;
                head2 = head.next;
                temp = temp.next;
            }
        }
        while(head1!=null)
        {
            temp.next = head1;
            head1 = head1.next;
            temp= temp.next;
        }
        while(head2!=null)
        {
            temp.next = head2;
            head2 = head2.next;
            temp= temp. next;
        }
        return mergedLL.next;

    }
    public Node mergeSort(Node head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }
        Node mid = getMid(head);
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);
        return merge(newLeft, newRight);
    }
    public void zigZag()
    {
        Node slow = head;
        Node fast = head;
        while(fast!= null && fast.next!= null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while(curr!= null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        Node nextL, nextR;
        while(left!= null && right!= null)
        {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;
            left = nextL;
            right = nextR;
        }
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
        ll.zigZag();
        ll.print();
    }
        
        


    
}
