package com.example.splitwise.demo.exceptions;

import java.nio.file.FileSystemException;

public class StudentInfoFetcher {
     String getStudent(int id) throws InvalidIdException, FileSystemException  {
         if (id < 0) {
             // throw for throwing new exceptions.

             // if extending a runtime exception -> it will be unchecked,
             // compiler won't force you to handle or declare the exception
                 throw new InvalidIdException();
         } else if (id == 0) {
             throw new FileSystemException("hi");
         }

         return "Hello " + id;
     }

}
