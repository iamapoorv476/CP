import java.util.*;
public class stackB
{
    // static class Node{
    //     int data;
    //     Node next;
    //     Node(int data)
    //     {
    //         this.data = data;
    //         this.next = null;
    //     }
    // }
    // static class Stack{
    //     static Node head = null;
    //     public static boolean isEmpty()
    //     {
    //         return head == null;
    //     }
    //     public static void push(int data)
    //     {
    //         Node newNode = new Node(data);
    //         if(isEmpty())
    //         {
    //             head = newNode;
    //             return;
    //         }
    //         newNode.next = head;
    //         head = newNode;

    //     }
    //     public static int pop()
    //     {
    //         if(isEmpty())
    //         {
    //             return -1;
    //         }
    //         int top = head.data;
    //         head = head.next;
    //         return top;
    //     }
    //     public static  int peek()
    //     {
    //         if(isEmpty())
    //         {
    //             return -1;
    //         }
    //         return head.data;
    //     }
    // }


    
    
        // static ArrayList<Integer> list = new ArrayList<>();
        // public static boolean  isEmpty()
        // {
        //     return list.size()== 0;
        // }
        // public static void push(int data)
        // {
        //     list.add(data);
        // }
        // public static int pop()
        // {
        //     if(isEmpty()){
        //         return -1;
        //     }
        //     int top = list.get(list.size()- 1);
        //     list.remove(list.size()- 1);
        //     return top;
        // }
        // public static int peek()
        // {
        //     if(isEmpty())
        //     {
        //         return -1;
        //     }
        //     return list.get(list.size()- 1);
        // }
        // public static void pushAtBottom(Stack<Integer> s, int data)
        // {
        //     if(s.isEmpty())
        //     {
        //         s.push(data);
        //         return;
        //     }
        //     int top = s.pop();
        //     pushAtBottom(s, data);
        //     s.push(top);
        // }
        // public static void reverseString(String str)
        // {
        //     Stack<Character> s = new Stack<>();
        //     int idx = 0;
        //     while(idx < str.length())
        //     {
        //         s.push(str.charAt(idx));
        //         idx++;
        //     }
        //     StringBuilder result = new StringBuilder("");
        //     while(! s.isEmpty())
        //     {
        //         char curr = s.pop();
        //         result.append(curr);
        //     }
        //     str = result.toString();

        // }
        // public static void ReverseStack(Stack<Integer> s)
        // {
        //     if(s.isEmpty())
        //     {
        //         return;
        //     }
        //     int top = s.pop();
        //     ReverseStack(s);
        //     pushAtBottom(s, top);

        // }
        // public static void printStack(Stack<Integer> s)
        // {
        //     while(!s.isEmpty())
        //     {
        //         System.out.println(s.pop());
        //     }
        // }
        // public static void StockSpan(int Stocks[] , int span[])
        // {
        //     Stack<Integer> s = new Stack<>();
        //     span[0] = 1;
        //     s.push(0);
        //     for(int i = 1; i< Stocks.length; i++)
        //     {
        //         int currPrice = Stocks[i];
        //         while(!s.isEmpty() && currPrice> Stocks[s.peek()]);
        //         {
        //             s.pop();
        //         }
        //         if(s.isEmpty())
        //         {
        //             span[i] = i+1;
        //         }
        //         else{
        //             int prevHigh = s.peek();
        //             span[i] = i - prevHigh;
        //         }
        //         s.push(i);


        //     }
        // }
        public static boolean isValid(String str)
        {
            Stack <Character> s = new Stack<> ();
            for(int i = 0; i<str.length(); i++)
            {
                char ch = str.charAt(i);
                if(ch=='(' || ch=='{' || ch=='[')
                {
                    s.push(ch);
                }
                else{
                   if(s.isEmpty())
                   {
                    return false;
                   } 
                   if((s.peek() == '(' && ch == ')')
                   || (s.peek()== '{' && ch== '}')
                   || (s.peek()== '[' && ch == ']'))
                   {
                    s.pop();
                   }
                   else{
                    return false;
                   }


                }
            }
            if(s.isEmpty())
            {
                return true;
            }
            else{
                return false;
            }
        }
        public static boolean isDuplicate(String str)
        {
            Stack<Character> s = new Stack<>();
            for(int i = 0;i< str.length(); i++)
            {
                char ch = str.charAt(i);
                if(ch==')')
                {
                    int count = 0;
                    while(s.peek()!='('){
                        s.pop();
                        count++;
                    }
                    if(count<1)
                    {
                        return true;
                    }
                    else{
                        s.pop();
                    }
                }
                else{
                    s.push(ch);
                }
            }
            return false;
        }
        public static void main(String args[])
        {
            String str = "((a+b))";
            String str2= "(a-b)";
            System.out.println(isDuplicate(str));
            
            // int arr[] = {5,3,6,8,3,3};
            // Stack <Integer> s = new Stack<>();
            // int nxtGreater[] = new int[arr.length];
            // for(int i = arr.length -1; i>=0; i--)
            // {
            //     while(!s.isEmpty()&& arr[s.peek()]<=arr[i])
            //     {
            //         s.pop();
            //     }
            //     if(s.isEmpty())
            //     {
            //         nxtGreater[i]   = -1;
            //     }
            //     else{
            //         nxtGreater[i] = arr[s.peek()];
            //     }
            //     s.push(i);
            // }
            // for(int i =0; i<nxtGreater.length;i++)
            // {
            //     System.out.print(nxtGreater[i] + " ");
            // }
            // System.out.println();

            // // int Stocks[] = {100,34,67,33,78,533,23,67};
            // // int span[] = new int[Stocks.length];
            // // StockSpan(Stocks, span);
            // // for(int i = 0; i< span.length; i++)
            // // {
            // //     System.out.println(span[i] + " ");
            // // }

            // // // Stack s = new Stack();
            

            
        }
    }

    



    
    
    

    

