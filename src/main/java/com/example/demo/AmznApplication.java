package com.example.demo;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class AmznApplication {

	public static void main(String[] args) {
	System.out.println("printing from java program");
		SpringApplication.run(AmznApplication.class, args);
	}

}
