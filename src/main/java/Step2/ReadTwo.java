package Step2;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadTwo
{
    public static void main(String[] args)
    {
        try {
            String fileName = "/Users/christine/LocalProjects/Solo/FileIOJava/src/main/java/Step2/input.txt";
            Scanner fileIn = new Scanner(new File(fileName));

            while (fileIn.hasNext()) 
            {
                // Reads the entire line as a string
                String lineIn = fileIn.nextLine(); 
                // Split the line into a String array
                String[] input = lineIn.split(",");
                int sum = 0;
                for (int i = 0; i < input.length; i ++) {
                    sum += Integer.parseInt(input[i]);
                }
                System.out.println(sum);
            }
        }
        catch (IOException e) {
            System.out.println("File not found");
        }
    }
}