package llamaspring.llamathree;

import llamaspring.llamathree.functions.WeatherConfigProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(WeatherConfigProperties.class)
@SpringBootApplication
public class GemmatwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GemmatwoApplication.class, args);
	}

}
