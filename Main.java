import java.util.*;
class Parent {
    // Method in the Parent class
    void display() {
        System.out.println("This is the Parent class method.");
    }
}

// Derived class (Child class)
class Child extends Parent {
    // Overriding the display() method in the Child class
    @Override
    void display() {
        System.out.println("This is the Child class method.");

        // Calling the Parent class method using super
        super.display();
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of the Child class
        Child child = new Child();

        // Calling the overridden display() method of the Child class
        child.display();
    }
}
// class Parent {
//     // Constructor of the Parent class
//     Parent() {
//         System.out.println("Parent class constructor called");
//     }

//     Parent(String message) {
//         System.out.println("Parent class constructor with message: " + message);
//     }
// }

// // Derived class (Child class)
// class Child extends Parent {
//     // Constructor of the Child class
//     Child() {
//         // Calling Parent class constructor using super()
//         super(); // This will call the default Parent constructor
//         System.out.println("Child class constructor called");
//     }

//     Child(String message) {
//         // Calling Parent class constructor with argument using super(message)
//         super(message); // This will call the Parent constructor with a String argument
//         System.out.println("Child class constructor with message: " + message);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         // Creating Child class object with default constructor
//         Child child1 = new Child();

//         System.out.println(); // For readability

//         // Creating Child class object with parameterized constructor
//         Child child2 = new Child("Hello from Child!");
//     }
// }
// public class arrayCC{
//     static int gcd(int a, int b) {
//         if (b == 0) {
//             return a; // Base case: If b is 0, GCD is a
//         }
//         return gcd(b, a % b); // Recursive step: GCD(a, b) = GCD(b, a % b)
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Taking two numbers as input from the user
//         System.out.print("Enter the first number: ");
//         int num1 = scanner.nextInt();
//         System.out.print("Enter the second number: ");
//         int num2 = scanner.nextInt();

//         // Calling the recursive gcd method
//         int result = gcd(num1, num2);

//         System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + result);

//         scanner.close();
//     }
    // static int fibonacci(int n) {
    //     if (n <= 1) {
    //         return n; // Base cases: fib(0) = 0, fib(1) = 1
    //     }
    //     return fibonacci(n - 1) + fibonacci(n - 2); // Recursive relation
    // }

    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);
        
    //     System.out.print("Enter the number of terms: ");
    //     int n = scanner.nextInt();
        
    //     System.out.println("Fibonacci Series up to " + n + " terms:");
    //     for (int i = 0; i < n; i++) {
    //         System.out.print(fibonacci(i) + " ");
    //     }
        
    //     scanner.close();
    // }
//     public static int getLargest(int numbers[])
//     {
//         int largest = Integer.MIN_VALUE;
//         int smallest = Integer.MAX_VALUE;
//         for(int i = 0; i<numbers.length; i++)
//         {
//             if(numbers[i] > largest)
//             {
//                 largest = numbers[i];
//             }
//             if(numbers[i]< smallest)
//             {
//                 smallest = numbers[i];
//             }
//         }
//         System.out.println("smallest array is" + smallest);
//         return largest;


//     }
//     public static void main(String args[])
//     {
//         int numbers[] = { 12,44,21,44,34};
//         System.out.println("Largest array is" + getLargest(numbers));
//     }

 
    

