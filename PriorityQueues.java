import java.util.*;
public class PriorityQueues {
    // static class Student implements Comparable<Student>{
    //    String name;
    //    int rank; 
    //    public Student(String name, int rank){
    //     this.name = name;
    //     this.rank= rank;
    //    }
    //    @Override
    //    public int compareTo(Student s2){
    //     return this.rank - s2.rank;
    //    }
    // // }
    // static class Heap{
    //    ArrayList<Integer> arr = new ArrayList<>();
    //    public void add(int data){
    //     arr.add(data);
    //     int x =(arr.size()-1 );
    //     int par = (x-1)/2;

    //     while(arr.get(x)< arr.get(par)){

    //         int temp = arr.get(x);
    //         arr.set(x, arr.get(par));
    //         arr.set(par,temp);
    //         x= par;
    //         par= (x-1)/2;

    //     }
    // }
    // static class Point{
    //     int x;
    //     int y;
    //     int distsq;
    //     int idx;
    //     public Point(int x, int y, int distsq){
    //         this.x= x;
    //         this.y = y;
    //         this.distsq = distsq;
    //         this.idx = idx;
    //     }
    //     @Override
    //     public int compareTo(Point p2){
    //         return this.distsq- p2.distsq;
    //     }
    // }
    // public int peek(){
    //     return arr.get(0);
    // }
    // private void heapify(int i){
    //     int left = 2*i + 1;
    //     int right = 2*i +2;
    //     int midIdx = i;
    //     if(left<arr.size()&& arr.get(midIdx)> arr.get(left)){
    //         midIdx= left;
    //     }
    //     if(right<arr.size()&& arr.get(midIdx)> arr.get(right)){
    //         midIdx = right;
    //     }
    //     if(midIdx!=i){
    // //         int temp = arr.get(i);
    //         arr.set(i, arr.get(midIdx));
    //         arr.set(midIdx, temp);
    //         heapify(midIdx);
    //     }

    // }
    // public int remove(){
    //     int data = arr.get(0);
    //     int temp = arr.get(0);
    //     arr.set(0,arr.get(arr.size()-1));
    //     arr.set(arr.size()-1, temp);
    //     arr.remove(arr.size()-1);
    //     heapify(0);
    //     return data;
    // }
    // public boolean isEmpty(){
    //     return arr.size()==0;
    // }
    
    public static void main(String args[]){
        int ropes[] = {2,4,3,6,7};
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<ropes.length; i++){
            pq.add(ropes[i]);
        }
        int cost =0;
        while(pq.size()>1){
            int min = pq.remove();
            int min2= pq.remove();
            cost = cost + min+ min2;
            pq.add(min+min2);

        }
        System.out.println("cost of connecting N ropes "  + cost);
        // Heap h = new Heap();
        // h.add(3);
        // h.add(5);
        // h.add(2);
        // h.add(8);
        // while(!h.isEmpty()){
        //     System.out.println(h.peek());
        //     h.remove();
        // }
        // int pts[][]= {{3,3}, {5,-1} ,{-2,4}};
        // int k =2;
        // PriorityQueue<Point> pq = new PriorityQueue<>();
        // for(int i =0; i<pts.length;i++){
        //     int distsq = pts[i][0]*pts[i][0] + pts[i][1]* pts[i][1];
        //     pq.add(new Point(pts[i][0], pts[i][1],distsq));
        // }
        // for(int i =0; i<k;i++){
        //     System.out.println("C"+ pq.remove());
        // }
        // PriorityQueue<Student> pq = new PriorityQueue<>();
        // pq.add(new Student(null, 0)
        // pq.add(new Student(name:"B" , rank: 5));

        // pq.add(new Student(name: "C" ,rank: 3));
        
        // while(!pq.isEmpty()){
        //     System.out.println(pq.peek().name + " " + pq.peek().rank);
        //     pq.remove();
        }
    }

    

