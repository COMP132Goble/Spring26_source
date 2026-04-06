package Input_Output;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LineReader {
    public static void main(String[] args) {
        String fileName = "./spring26/src/Input_Output/secret.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            int lineNumber = 1;

            System.out.println("Reading file line by line:");
            while((line = reader.readLine()) != null) {
                System.out.println(lineNumber++ + ":" + line);
            }
        } catch(IOException e) {
            System.err.println("Read error: " + e.getMessage());
        }
    }
}
