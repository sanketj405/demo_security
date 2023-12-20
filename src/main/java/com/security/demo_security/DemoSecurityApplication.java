package com.security.demo_security;

import com.security.demo_security.model.Employee;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.List;
import java.util.stream.Stream;



@SpringBootApplication
public class DemoSecurityApplication {


	public static void main(String[] args) {
		SpringApplication.run(DemoSecurityApplication.class, args);
	}

}
