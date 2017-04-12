package dtables;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

/**
 * Created by Vladimir on 27.02.2017.
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "HFWA.FindAll", query = "select h from HFWA h")
})
public class HFWA {
    @Id
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    private Date dateassembly;

    public Date getDateassembly() {
        return dateassembly;
    }

    public void setDateassembly(Date dateassembly) {
        this.dateassembly = dateassembly;
    }

    @OneToMany(mappedBy = "hfwa")
    private Collection<Assembly> assemblies;

    public Collection<Assembly> getAssemblies() {
        return assemblies;
    }

    public void setAssemblies(Collection<Assembly> assemblies) {
        this.assemblies = assemblies;
    }
}
