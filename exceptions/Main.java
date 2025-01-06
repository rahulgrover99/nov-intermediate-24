package com.example.splitwise.demo.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.*;

public class Main {

    public static void main(String[] args) {
        Division division = new Division(5, 0);
        try {
            System.out.println(division.execute());
        } catch (RuntimeException e) {
            System.out.println("Division by zero happened.");
        }

        System.out.println("Hello world");

        readFile();

        StudentInfoFetcher studentInfoFetcher = new StudentInfoFetcher();
        try {
            studentInfoFetcher.getStudent(-1);
        } catch (InvalidIdException | FileSystemException e) {
            throw   new RuntimeException(e);
        }

    }

    public static String readFile() {
        String expected_value = "Hello, world!";

        Path path = Paths.get("src/test/resources/fileTest.txt");

        String read = null;
        try {
            // checked exception -> Mandatory to be handled by the developer.
            read = Files.readAllLines(path).get(0);
        } catch (IOException e) {
            System.out.println("File not found");
        } catch (Exception e) {
            System.out.println("This block will not reach since exception caught previously.");
        }
        return read;
    }


    // CHECKED Exceptions
    // throws ___Exception in the method signature
    // That's a way to declare that an exception is being thrown.

    // try .. catch block
    // handling the exception in that method itself.

    // multiple catch blocks can exist.
    // we try to go to catch blocks sequentially
    // the first catch block that matches the type of execution is executed.

}
