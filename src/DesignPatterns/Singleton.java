package DesignPatterns;

public class Singleton {
    // Static variable reference of single_instance 
    private static Singleton singleton_instance = null;

    // Declating a variable of type String
    public String str;

    private Singleton() {
        str = "Hello, I am a string from the Singleton class";
    }

    public static synchronized Singleton getInstance() {
        if(singleton_instance == null) 
            singleton_instance = new Singleton();
        return singleton_instance;
    }
}
