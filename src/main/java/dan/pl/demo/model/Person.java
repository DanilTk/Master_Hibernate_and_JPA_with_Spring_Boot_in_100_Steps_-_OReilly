package dan.pl.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "PERSON")
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "LOCATION")
    private String location;

    @Column(name = "BIRTH_DATE")
    private LocalDateTime birthDate;

    @Override
    public String toString() {
        return String.format("\nPerson{id=%d, name='%s', location='%s', birthDate=%s}", id, name, location, birthDate);
    }
}

