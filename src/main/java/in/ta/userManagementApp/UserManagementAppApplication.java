package in.ta.userManagementApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

@ComponentScan(basePackages = "in.ta.main")
@EntityScan(basePackages = "in.ta.main")
public class UserManagementAppApplication {

	public static void main(String[] args) {
		System.out.println("here piyush");
		SpringApplication.run(UserManagementAppApplication.class, args);
	}

}
