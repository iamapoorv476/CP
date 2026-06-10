import java.util.*;
import java.util.LinkedList<>;
public class Tree {
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
    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[])
        {
            idx++;
            if(nodes[idx]== -1)
            {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
        public static void preorder(Node root){
            if(root==null)
            {
                return;
            }
            System.out.print(root.data +" ");
            preorder(root.left);
            preorder(root.right);
        }
        public static void inorder(Node root)
        {
            if(root == null)
            {
                return;
            }
            inorder(root.left);
            System.out.print(root.data+ " ");
            inorder(root.right);
        }
        public static void postorder(  Node root)
        {
            if(root == null)
            {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+ " ");
        }
        public static void levelorder(Node root)
        {
            if(root == null)
            {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty())
            {
                Node currNode = q.remove();
                if(currNode== null)
                {
                    System.out.println();
                }
                if(q.isEmpty())
                {
                    break;
                }
                else{
                    q.add(null);
                }
                else{
                    System.out.print(currNode.data + " ");}
                    if(currNode.left! = null){

                    }
                
            }

        }
    }
    public static int height(Node root)
    {
        if(root == null)
        {
            return 0;

        }
        int lh = height(root.left);
        int  rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }
    // static class Info{
    //     int diam;
    //     int ht;
    //     public Info(int diam,int ht)
    //     {
    //         this.diam= diam;
    //         this.ht=ht;
    //     }
    // }
    // public static Info diameter(Node root)
    // {
    //     if(root==null)
    //     {
    //         return new Info(0,0);
    //     }
    //     Info leftInfo = diameter(root.left);
    //     Info rightInfo= diameter(root.right);
    //     int diam =( Math.max(Math.max(leftInfo.diam, rightInfo.diam,leftInfo.ht+rightInfo.ht+ 1)));
    //     int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;
    //     return new Info(diam,ht);

    // }
     public static boolean isIdentical(Node node, Node subRoot){
        if(node== null&& subRoot == null){
            return true;
        }
        else if(node==null|| subRoot == null|| node.data!= subRoot.data){
            return false;
        }
        if(!isIdentical(node.left,subRoot.left)){
            return false;
        }
        if(!isIdentical(node.right,subRoot.right)){
            return false;
        }
        return true;

    }
    public static boolean isSubtree(Node root,Node subRoot)
    {
        if(root== null)
        {
            return false;
        }
        if(root.data == subRoot.data)
        {
            if(isIdentical(root,subRoot))
            {
                return true;
            }
        }
        return isSubtree(root.left,subRoot)|| isSubtree(root.right,subRoot);
    }
    static class Info{
        Node node;
        int hd;
        public Info(Node node, int hd){
            this.node= node;
            this.hd= hd;
        }
    }
    public static void topView(Node root){
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node>map = new HashMap<>();
        int min =0,max=0;
        q.add(new Info(root,0));
        q.add(null);

        while(!q.isEmpty()){
            Info curr = q.remove();
            if(curr == null){
                if(q.isEmpty())
                {
                    break;
                }
                else{
                    q.add(null);
                }
            }
            if(!map.containsKey(curr.hd)){
                map.put(curr.hd,curr.node);
            }
        if(curr.node.left!= null)
        {
            q.add(new Info(curr.node.left,curr.hd-1));
            min= Math.min(min,curr.hd-1);
        }
        
        }
    }

    public static void main(String args[])
    {
        // int nodes[] ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        // BinaryTree tree = new BinaryTree();
        // Node root =tree.buildTree(nodes);
        // // tree.preorder(root);
        // tree.postorder(root);
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right= new Node(5);
        root.right.left= new Node(6);
        root.right.right= new Node(7);

        Node subRoot= new Node(2);
        subRoot.left = new Node(4);
        subRoot.right= new Node(5);
       System.out.println(isIdentical(root, subRoot));
    }
    
}
