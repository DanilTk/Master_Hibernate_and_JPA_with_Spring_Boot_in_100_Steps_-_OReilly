package dan.pl.demo.repository;

import dan.pl.demo.model.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class PersonJPA {
    private final EntityManager entityManager;

    public Person findById(long id) {
        return entityManager.find(Person.class, id);
    }
}
