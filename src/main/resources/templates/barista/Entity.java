package #####;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ${Resource} {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
