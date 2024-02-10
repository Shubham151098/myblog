package com.myblog.myblog.java8;

public class Singleton {
    // Private static instance variable
    private static Singleton instance;

    // Private constructor to prevent instantiation from outside
    private Singleton() {
        // initialization code (if needed)
    }

    // Public method to get the single instance of the class
    public static Singleton getInstance() {
        // If the instance is null, create a new instance
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Other methods of the class (if any)

    public void displayMessage() {
        System.out.println("This is a Singleton instance.");
    }

    // Main method for testing
    public static void main(String[] args) {
        // Get an instance of the Singleton class
        Singleton singleton = Singleton.getInstance();

        // Use the instance
        singleton.displayMessage();
    }
}
