import java.util.*;
public class Binarytree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }
    public static void Klevel(Node root,int level,int k){
        if(root==null){
            return;
        }
        if(level==k){
            System.out.print(root.data + " ");
            return;
        }
        Klevel(root.left,level+1,k);
        Klevel(root.right,level+1,k);
    }
    public static Node lc2(Node root, int n1, int n2){
        if(root== null|| root.data==n1|| root.data==n2){
            return root;
        }
        Node leftlca = lc2(root.left, n1,n2);
        Node rightlca = lc2(root.right,n1,n2);
        if(rightlca== null){
            return leftlca;
        }
        if(leftlca== null){
            return rightlca;
        }
        return root;
    } 
    public static void main(String args[]){
        Node root = new Node(1);
        root.left= new Node(2);
        root.right= new Node(3);
        root.left.left= new Node(4);
        root.left.right= new Node(5);
        int k= 2;
        int n1 =3, n2 = 4;
        System.out.println(lc2(root,n1,n2).data);
    }
    
}
