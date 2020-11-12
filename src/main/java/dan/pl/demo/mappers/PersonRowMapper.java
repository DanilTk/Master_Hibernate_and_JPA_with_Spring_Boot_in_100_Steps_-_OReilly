package dan.pl.demo.mappers;

import dan.pl.demo.model.Person;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class PersonRowMapper implements RowMapper<Person> {

    @Override
    public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
        return Person.builder()
                .id(rs.getLong("id"))
                .name(rs.getString("name"))
                .location(rs.getString("location"))
                .birthDate(rs.getTimestamp("birth_date").toLocalDateTime())
                .build();
    }
}
