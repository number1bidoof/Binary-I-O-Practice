import java.io.*;
import java.util.Date;

/**
 * Exercise 2: Write and read binary data
 *
 * Requirements:
 * Part 1 - WRITE:
 * - Store an array of five int values: 1, 2, 3, 4, 5
 * - Store a Date object for the current time
 * - Store the double value 5.5
 * - Write all to file named Exercise17_02.dat
 *
 * Part 2 - READ:
 * - In the same program, read the data back
 * - Display all values to verify they were stored correctly
 *
 * @author Ayah Abdalla
 */
public class Exercise17_02 {

    public static void main(String[] args) throws IOException {

        // Data to write
        int[] numbers = {1, 2, 3, 4, 5};
        Date currentTime = new Date();
        double value = 5.5;

        // PART 1: WRITE DATA
        try (DataOutputStream output = new DataOutputStream(
            new FileOutputStream("Exercise17_02.dat"))) {
            
            for (int i: numbers){
                output.writeInt(i);
            } 

            output.writeLong(currentTime.getTime());
            
            output.writeDouble(value);
        }


        System.out.println("Data written to Exercise17_02.dat");

        // PART 2: READ DATA
        try (DataInputStream input = new DataInputStream(
            new FileInputStream("Exercise17_02.dat"))) {
            // TODO: Read the array of integers
            // Hint: Create a new array and use readInt() five times


            // TODO: Read the Date object
            // Hint: Use readLong() and create new Date with that value


            // TODO: Read the double value


            // TODO: Close the input stream (or use try-with-resources)

                
            }
        
        // TODO: Display all the data you read
        System.out.println("\nData read from Exercise17_02.dat:");
        // Display array, date, and double value

    }
}