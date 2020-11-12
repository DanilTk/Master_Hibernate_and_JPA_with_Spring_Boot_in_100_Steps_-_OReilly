package dan.pl.demo.repository;

import dan.pl.demo.mappers.PersonRowMapper;
import dan.pl.demo.model.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class PersonJdbc {
    private final JdbcTemplate jdbcTemplate;
    private final PersonRowMapper personRowMapper;

    public List<Person> findAll() {
        return jdbcTemplate.query("select * from person", new BeanPropertyRowMapper(Person.class));
    }

    public Person findById(int id) {
        return jdbcTemplate.queryForObject("select * from person where id=?", new Object[]{id}, personRowMapper);
    }
}
