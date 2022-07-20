package agri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("agri")
public class AgriculturalHouseholdApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgriculturalHouseholdApplication.class, args);
	}

}
