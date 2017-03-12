package dtables;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.sql.Date;
import java.time.LocalDateTime;

/**
 * Created by Vladimir on 12.03.2017.
 */
@Entity
public class Assembly {
    @Id
    private int id;

    @ManyToOne(optional = false)
    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @ManyToOne(optional = false)
    private Detail detail;

    public Detail getDetail() {
        return detail;
    }

    public void setDetail(Detail detail) {
        this.detail = detail;
    }

    @ManyToOne(optional = false)
    private HFWA hfwa;

    public HFWA getHfwa() {
        return hfwa;
    }

    public void setHfwa(HFWA hfwa) {
        this.hfwa = hfwa;
    }

    @Basic
    private boolean active;

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }


    @Basic
    private LocalDateTime assemblydatetime;

    public LocalDateTime getAssemblydatetime() {
        return assemblydatetime;
    }

    public void setAssemblydatetime(LocalDateTime assemblydatetime) {
        this.assemblydatetime = assemblydatetime;
    }
}
