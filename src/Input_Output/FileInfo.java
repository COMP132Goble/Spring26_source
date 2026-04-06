package Input_Output;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class FileInfo {
    public static void main(String[] args) {
        File file = new File("./spring26/src/Input_Output/sample2.txt");

        // Create the file if it doesn't exist
        try {
            if(file.createNewFile()) {
                System.out.println("New File Created!");
            } else {
                System.out.println("File already exists!");
            }
        } catch (IOException e) {
            System.err.println("Error creating file: " + e.getMessage());
        }

        // Query file properties
        System.out.println("\nFile Information:");
        System.out.println("  Name: " + file.getName());
        System.out.println("  Path: " + file.getAbsolutePath());
        System.out.println("  Size: " + file.length() + " bytes");
        System.out.println("  Readable: " + file.canRead());
        System.out.println("  Writable: " + file.canWrite());
        System.out.println("  Executable: " + file.canExecute());

        // Last modified date
        Instant modified = Instant.ofEpochMilli(file.lastModified());
        String formattedDate = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
            .withZone(ZoneId.systemDefault())
            .format(modified);
        System.out.println("  Modified: " + formattedDate);

        // Check if it's a file or directory
        System.out.println("  Is file: " + file.isFile());
        System.out.println("  Is directory: " + file.isDirectory());

        // Delete file
        if (file.delete()) {
            System.out.println("\nFile deleted.");
        }
    }
}
