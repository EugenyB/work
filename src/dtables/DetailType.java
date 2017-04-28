package dtables;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Vladimir on 12.03.2017.
 */
@Entity
public class DetailType {
    @Id
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    private String nameDet;

    public String getNameDet() {
        return nameDet;
    }

    public void setNameDet(String nameDet) {
        this.nameDet = nameDet;
    }


    @OneToMany(mappedBy = "dtype")
    private Collection<Detail> details;

    public Collection<Detail> getDetails() {
        return details;
    }

    public void setDetails(Collection<Detail> details) {
        this.details = details;
    }
}
