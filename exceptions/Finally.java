package com.example.splitwise.demo.exceptions;

import java.nio.file.FileSystemException;
import java.util.function.Consumer;

public class Finally {
    public static void main(String[] args) throws RuntimeException {

        StudentInfoFetcher studentInfoFetcher  = new StudentInfoFetcher();

//        Consumer<Integer> consumer =  a -> studentInfoFetcher.getStudent(a);

        try {
            studentInfoFetcher.getStudent(1);
        } catch (FileSystemException e) {
            throw new RuntimeException(e);
        } catch (InvalidIdException e) {
            System.out.println("Invalid ID");
        } finally {
            System.out.println("Bye bye!");
            throw new RuntimeException("hi");
        }

    }
}
