import java.util.*;
public class BST {
    static class Node{
        int data;
        Node left;
        Node right;
        
        Node(int data){
            this.data= data;
        }
    }
    public static Node insert(Node root, int val){
        if(root==null){
        root = new Node(val);
        return root;
        }
        if(root.data > val){
            root.left = insert(root.left, val);// left subtree
        }
        else{
            root.right = insert(root.right,val);// right subtree
        }
        return root;



    }
    public static boolean search(Node root, int key){
        if(root== null){
            return false;
        }
        if(root.data== key){
            return true;
        }
        if(root.data>key){
            return search(root.left, key);
        }
        else{
            return search(root.right,key);
        }
    }public static Node delete(Node root , int val){
        if(root.data < val){
           root.right = delete(root.right,val); 
        }
        else if(root.data >val){
            root.left = delete(root.left,val);
        }
        else{
            //case1- leaf node
            if(root.left == null&& root.right==null){
                return null;
            }
            if(root.left== null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
           Node IS = findInorderSuccessor(root.right);
           root.data = IS.data;
           root.right= delete(root.right,IS.data);
        }
        return root;
    }
    public static Node findInorderSuccessor(Node root){
        while(root.left!=null){
            root= root.left;
        }
        return root;
    }
    public static boolean ValidateBST(Node root, Node min, Node max){
        if(root== null){
            return true;
        }
        if(min!= null && root.data<= min.data){
            return false;
        }
        else if(max!= null&& root.data>= max.data){
            return false;
        }
        return ValidateBST(root.left,min,root)
        && ValidateBST(root.right,root,max);

    }
    public static void preorder(Node root){
        if(root== null){
            return;
        }
        System.out.print(root.data+ " ");
        preorder(root.left);
        preorder(root.right);

    }
public static Node createBST(ArrayList<Integer> inorder,int st, int end){
    if(st> end){
        return null;
    }
    int mid = (st+ end)/2;
    Node root = new Node(inorder.get(mid));
    root.left = createBST(inorder, st,mid-1);
    root.right= createBST(inorder,mid+1, end);
    return root;
}



    public static void inorder(Node root){
        if(root== null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static void printPath(ArrayList<Integer>path){
        for(int i=0;i<path.size(); i++){
            System.out.print(path.get(i) +"-> ");

        }
        System.out.println("null");
    }
    public static void printRoot2leaf(Node root,ArrayList<Integer> path){
        if(root== null){
            return;
        }

        path.add(root.data);
        if(root.left== null&& root.right== null){
           printPath(path); 
        }
        printRoot2leaf(root.left,path);
        printRoot2leaf(root.right,path);
        path.remove(path.size()-1);
    }
    public static void getInorder(Node root, ArrayList<Integer> inorder){
        if(root==null){
            return;
        }
        getInorder(root.left,inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }
    public static Node Balancedbst(Node root){
        ArrayList<Integer> inorder  = new ArrayList<>();
        getInorder(root, inorder);
        root = createBST(inorder, 0, inorder.size()-1);
        return root;
    }
    public static void getInorders(Node root, ArrayList<Integer> arr){
        if(root == null){
            return;
        }
        getInorders(root.left, arr);
        arr.add(root.data);
        getInorder(root.right,arr);

    }
    public static Node createBSTs(ArrayList<Integer> arr, int st, int end){
        if(st>end){
            return;
        }
        int mid = (st+end)/2;
        Node root = new Node(arr.get(mid));
        root.left = createBSTs(arr,st,mid-1);
        root.right= createBSTs(arr,mid+1,end);
        return root;


    }
public static Node mergeBst(Node root1, Node root2){
    ArrayList<Integer> arr1= new ArrayList<>();
        getInorder(root1, arr1);

        ArrayList<Integer> arr2= new ArrayList<>();
        getInorder(root2,arr2);

        int i =0;
        int j =0;

        ArrayList<Integer> finalArr= new ArrayList<>();
        while(i< arr1.size()&& j<arr2.size()){
            if(arr1.get(i)<= arr2.get(j)){
                finalArr.add(arr1.get(i));
                i++;
            }
            else{
                finalArr.add(arr2.get(j));
                j++;
            }
        }
        while(i<arr1.size()){
            finalArr.add(arr1.get(i));
            i++;
        }
        while(j<arr2.size()){
            finalArr.add(arr2.get(j));
            j++;
        }
        createBSTs(finalArr,0,finalArr.size()-1);
}
        
    public static void preorders(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String args[]){
        Node root1 = new Node(4);
        root1.left = new Node(3);
        root1.left = new Node(6);
        Node root2 = new Node(7);
        root2.left= new Node(5);
        root2.right= new Node(10);
        Node root = mergeBst(root1, root2);
        preorder(  root);
        // Node root = new Node(8);
        // root.left = new Node(6);
        // root.left.left= new Node(5);
        // root.left.left.left= new Node(3);
        // root.right = new Node(10);
        // root.right.right= new Node(11);
        // root.right.right.right= new Node(12);
        // root = Balancedbst(root);
        // preorder(root);

        // int arr[]= {5,2,4,10,23,13,15,16};
        // Node root = createBST(arr, 0, arr.length-1);
        // preorder(root);
    //     int values[]= {5,1,3,4,2,7,10,14,11};
    //     Node root = null;
    //     for(int i =0; i< values.length; i++){
    //         root = insert(root, values[i]);

    //     }
    //     inorder(root);
    //     System.out.println();
    //     // root= delete(root, 1);
    //     // System.out.println();
    //     // inorder(root);
    //     // printRoot2leaf(root,new ArrayList<>());
    //     if(ValidateBST(root, null, null)){
    //         System.out.println("valid BST");
    //     }
    //     else{
    //         System.out.println("invalid BST");
    //     }
    // }
    
}
}
