package com.example.reminders;

import java.sql.DriverManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;

@SuppressWarnings("unused")
@SpringBootApplication
public class RemindersApplication {

	public static void main(String[] args) {
		SpringApplication.run(RemindersApplication.class, args);
		String url = "jdbc:postgresql://localhost:5432/reminderApp";
        String username = "postgres";
        String password = "postgres";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connected successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}
