package Step4;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadFour
{
    /**
     * Yes, you can look at the other 
     * examples in this lab to build your solution here.
     */
        public static void main(String[] args)
        {
            try {
                String fileName = "/Users/christine/LocalProjects/Solo/FileIOJava/src/main/java/Step4/input.txt";
                Scanner fileIn = new Scanner(new File(fileName));

                // create a running total var to keep track
                int runningTotal = 0;

                while (fileIn.hasNext())
                {
                    // Reads the entire line as a string
                    String lineIn = fileIn.nextLine();
                    // Split the line into a String array
                    String[] input = lineIn.split("\n");

                    for (int i = 0; i < input.length; i ++) {
                        runningTotal += Integer.parseInt(input[i]);
                        System.out.println("Running Total is: " + runningTotal);
                    }
                }
            }
            catch (IOException e) {
                System.out.println("File not found");
            }
        }
}