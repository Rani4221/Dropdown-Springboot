package pd.workshop.dropdown;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan("pd.workshop.dropdown")
public class DropdownApplication {

	public static void main(String[] args) {
		SpringApplication.run(DropdownApplication.class, args);
	}

}
