import java.io.*;

public class IOStreamExample {
    public static void main(String[] args) {
        // Create a BufferedReader to read input from the console
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // Create a BufferedWriter to write to a file
        BufferedWriter writer = null;

        try {
            // Ask user for input
            System.out.println("Enter text to write to the file (type 'exit' to stop):");

            // Create or open the file
            writer = new BufferedWriter(new FileWriter("output.txt"));

            String userInput;
            while (true) {
                // Read user input
                userInput = reader.readLine();

                // If the user types "exit", stop the program
                if ("exit".equalsIgnoreCase(userInput)) {
                    break;
                }

                // Write the input to the file
                writer.write(userInput);
                writer.newLine(); // Move to a new line in the file
            }

            System.out.println("Data has been written to output.txt");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            try {
                // Close the streams
                if (reader != null) {
                    reader.close();
                }
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing the streams: " + e.getMessage());
            }
        }
    }
}