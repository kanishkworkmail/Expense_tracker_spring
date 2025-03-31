package com.example.expense_tracker;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.h2.server.web.WebServlet;
import org.springframework.boot.SpringApplication;


@SpringBootApplication
public class ExpenseTrackerApplication {

	public static void main(String[] args) {

		SpringApplication.run(ExpenseTrackerApplication.class, args);


	}

}
