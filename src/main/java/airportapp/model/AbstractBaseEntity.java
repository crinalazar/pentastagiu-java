package airportapp.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractBaseEntity {
    @Id
    @GeneratedValue
    private Long id;

    public AbstractBaseEntity() {
    }

    public AbstractBaseEntity(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
