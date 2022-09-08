package lk.himash.dockerapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerappApplication {

	@GetMapping("/getMessage")	
	public String getMessage() {
		return "Message getting successfully ! ";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DockerappApplication.class, args);
	}

}
