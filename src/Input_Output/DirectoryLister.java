package Input_Output;

import java.io.File;

public class DirectoryLister {
    public static void main(String[] args) {
        File directory = new File("./spring26/src/Input_Output/");
        
        if (directory.isDirectory()) {
            String[] contents = directory.list();

            System.out.println("Contents of " + directory.getAbsolutePath());
            for (String name: contents) {
                File item = new File(directory, name);
                String type = item.isDirectory() ? "[DIR]" : "[FILE]";
                String size = item.isFile() ? "(" + item.length() + "bytes)" : "";
                System.out.println("\t" + type + " " + name + size);
            }
        }
    }
}
