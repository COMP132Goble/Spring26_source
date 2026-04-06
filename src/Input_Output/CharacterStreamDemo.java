package Input_Output;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamDemo {
    public static void main(String[] args) {
        String fileName = "./spring26/src/Input_Output/sample.txt";

        // Writing text with FileWriter
        try(FileWriter writer = new FileWriter(fileName)) {
            writer.write("Line 1: Hello World!\n");
            writer.write("Line 2: Java I/O can be very powerful\n");
            writer.write("Line 3: Character streams handle text.");
            System.out.println("Text written to the file...");
        } catch( IOException e) {
            System.err.println("Write error: " + e.getMessage());
        }

        try(FileReader reader = new FileReader(fileName)) {
            int charater;
            System.out.println("\nFile Contents:");
            while((charater = reader.read()) != -1) {
                System.out.print((char) charater);
            }
            System.out.println();
        } catch(IOException e) {
            System.err.println("Read error: " + e.getMessage());
        }
    }
}
