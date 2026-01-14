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

            // for loop to write array
            for (int i: numbers){
                output.writeInt(i);
            }
            // writes the current date using .getTime()
            output.writeLong(currentTime.getTime());
            // writes the double defined in value
            output.writeDouble(value);
        }

        System.out.println("Data written to Exercise17_02.dat");

        // PART 2: READ DATA
        try (DataInputStream input = new DataInputStream(
            new FileInputStream("Exercise17_02.dat"))) {

            int[] readArray = new int[5];
            // manually reads each integer in the array using indexing for each value
            readArray[0] = input.readInt();
            readArray[1] = input.readInt();
            readArray[2] = input.readInt();
            readArray[3] = input.readInt();
            readArray[4] = input.readInt();
            // assigns the date read to a new variable
            Date readDate = new Date(input.readLong());
            // assigns the read double to a new variable
            double readDouble = input.readDouble();

            // Date read is inside the try block, due to readArray, readDate & readDouble being local variable
            System.out.println("\nData read from Exercise17_02.dat:");

            // formats output for the given array, date & double
            for (int i: readArray){
                System.out.println(i);
            }

            System.out.println(readDate);

            System.out.println(readDouble);

        }
    }
}