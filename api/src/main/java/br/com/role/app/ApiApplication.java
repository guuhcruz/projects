package br.com.role.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class ApiApplication {
	
	@GetMapping()
	public ResponseEntity<String> get() {
	    return ResponseEntity.ok("API-ROLE");
	}

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}
}
