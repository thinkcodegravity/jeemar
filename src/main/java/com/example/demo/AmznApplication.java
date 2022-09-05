package com.example.demo;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class AmznApplication {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String> ();
		SpringApplication.run(AmznApplication.class, args);
	}

}
