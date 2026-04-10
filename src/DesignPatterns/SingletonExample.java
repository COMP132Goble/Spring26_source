package DesignPatterns;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SingletonExample {
    private static SingletonExample single_instace = null;

    private String fileName = "./spring26/src/DesignPatterns/logs.txt";

    private SingletonExample() {}

    public static SingletonExample getLogger() {
        if (single_instace == null) {
            single_instace = new SingletonExample();
        }

        return single_instace;
    }

    public synchronized void log(String message) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(message);
            writer.newLine();
            writer.flush();
        } catch (IOException e) {
            System.out.println("Failed to write to file...");
        }
    }
}
