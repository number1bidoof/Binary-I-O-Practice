import java.io.*;
import java.nio.file.Files;

/**
 * Exercise 3: Track how many times a program has been executed
 *
 * Requirements:
 * - Store an execution count in a file named Exercise17_03.dat
 * - Each time this program runs, increment the count by 1
 * - Display the current count
 * - Use the file persistence pattern:
 *   1. Read existing count (if file exists)
 *   2. Increment the count
 *   3. Write updated count back to file
 *
 * @author Ayah Abdalla
 */
public class Exercise17_03 {

    public static void main(String[] args) throws IOException {

        File file = new File("Exercise17_03.dat");
        int count = 0;
        // if the file already exists, the file simply reads count as the number in the binary file
        if (file.exists()){
            try(DataInputStream input = new DataInputStream(
                new FileInputStream("Exercise17_03.dat"))){
                count = input.readInt();
            }
        }
        // increments the count everytime the file is run
        count++;
        // If the file doesn't exist, it creates a new file and writes a 0 into the file
        try (DataOutputStream output = new DataOutputStream(
            new FileOutputStream("Exercise17_03.dat"))) {
            output.writeInt(count);
        }

        System.out.println("This program has been executed " + count + " time(s).");
    }
}