package dan.pl.demo;

import dan.pl.demo.repository.PersonJPA;
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
    private final PersonJPA jpa;

    @Override
    public void run(String... args) {
        logger.info("\nStarting run method");
        logger.info("All users -> {}", jdbcDao.findAll());
        logger.info("Found JDBC user -> {}", jdbcDao.findById(1));
        logger.info("Found JPA user -> {}", jpa.findById(1L));
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
