package in.kaushiklahiri.onlinebookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.hateoas.HypermediaAutoConfiguration;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableAutoConfiguration(exclude = {HypermediaAutoConfiguration.class})
@SpringBootApplication
@EnableSwagger2
public class OnlineBookStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineBookStoreApplication.class, args);
	}

}
