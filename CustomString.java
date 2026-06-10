public class CustomString {
    
    public int add(int a, int b) {
        return a + b;
    }

    // Add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Add an array of integers
    public int add(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    // Add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Add three doubles
    public double add(double a, double b, double c) {
        return a + b + c;
    }

    // Add an array of doubles
    public double add(double... numbers) {
        double sum = 0.0;
        for (double num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        CustomString calculator = new CustomString();

        // Testing integer additions
        System.out.println("Add two integers (5 + 10): " + calculator.add(5, 10));
        System.out.println("Add three integers (5 + 10 + 15): " + calculator.add(5, 10, 15));
        System.out.println("Add array of integers (1 + 2 + 3 + 4): " + calculator.add(1, 2, 3, 4));

        // Testing double additions
        System.out.println("Add two doubles (5.5 + 10.5): " + calculator.add(5.5, 10.5));
        System.out.println("Add three doubles (5.5 + 10.5 + 2.0): " + calculator.add(5.5, 10.5, 2.0));
        System.out.println("Add array of doubles (1.1 + 2.2 + 3.3 + 4.4): " + calculator.add(1.1, 2.2, 3.3, 4.4));
    }
}
    
    

