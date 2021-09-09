package tc.springframework;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("tc.springframework")
@PropertySource("classpath:playerMusic.properties")
public class SpringConfig {
}
