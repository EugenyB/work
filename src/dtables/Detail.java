package dtables;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Vladimir on 25.02.2017.
 */
@Entity
public class Detail {
    @GeneratedValue
    @Id
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @ManyToOne(optional = false)
    private DetailType dtype;

    public DetailType getDtype() {
        return dtype;
    }

    public void setDtype(DetailType dtype) {
        this.dtype = dtype;
    }

    @OneToMany(mappedBy = "detail")
    private Collection<Assembly> assemblies;

    public Collection<Assembly> getAssemblies() {
        return assemblies;
    }

    public void setAssemblies(Collection<Assembly> assembly) {
        this.assemblies = assembly;
    }
}
