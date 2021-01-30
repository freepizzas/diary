package hr.unipu.diary.backend.generator;

import com.vaadin.flow.spring.annotation.SpringComponent;
import hr.unipu.diary.backend.entity.Role;
import hr.unipu.diary.backend.repository.UserRepository;
import hr.unipu.diary.backend.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@SpringComponent
public class DataGenerator {

    @Bean
    public CommandLineRunner loadData(UserRepository userRepository) {
        return args -> {
            Logger logger = LoggerFactory.getLogger(getClass());
            if (userRepository.count() != 0L) {
                logger.info("Using existing database");
                return;
            }
            logger.info("Generating demo data");
            userRepository.save(new User("user", "u", Role.USER));
            userRepository.save(new User("admin", "a", Role.ADMIN));

            logger.info("Generated demo data");
        };
    }

}