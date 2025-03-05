package com.example.bookmyshow;

import com.example.bookmyshow.exceptions.SeatsAlreadyBookedException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.dao.CannotAcquireLockException;

@SpringBootApplication
public class BookmyshowApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookmyshowApplication.class, args);
    }

}
