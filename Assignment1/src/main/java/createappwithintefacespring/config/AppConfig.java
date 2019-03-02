package createappwithintefacespring.config;

import createappwithintefacespring.LoanInterest;
import createappwithintefacespring.service.SmallBusinesses;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

        @Bean(name="busineses")
        public LoanInterest getService(){
            return new SmallBusinesses("Salomi","mp123",800);
        }
}
