package dan.pl.demo;

import dan.pl.demo.repository.PersonJdbc;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class DemoApplication implements CommandLineRunner {
    private static Logger logger = LoggerFactory.getLogger("MY_LOGGER");
    private final PersonJdbc jdbcDao;

    @Override
    public void run(String... args) {
        logger.info("\nStarting run method");
        logger.info("All users -> {}", jdbcDao.findAll());
        logger.info("Found user -> {}", jdbcDao.findById(1));
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
