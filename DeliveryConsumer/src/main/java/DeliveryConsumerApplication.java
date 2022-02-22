import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Entity;

@SpringBootApplication
@ComponentScan(basePackages = {"com.nishi.kafka.*"})
@EntityScan(basePackages = {"com.nishi.kafka.*"})
@EnableJpaRepositories(basePackages = {"com.nishi.kafka.*"})
public class DeliveryConsumerApplication {

    public static void main(String[] args){
        SpringApplication.run(DeliveryConsumerApplication.class, args);
    }
}
