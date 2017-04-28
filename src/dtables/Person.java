package dtables;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Vladimir on 25.02.2017.
 */
@Entity
public class Person {
    @Id
    private int id;

    @Basic
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    private String passwd;

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    @OneToMany(mappedBy = "person")
    private Collection<Assembly> assemblies;

    public Collection<Assembly> getAssemblies() {
        return assemblies;
    }

    public void setAssemblies(Collection<Assembly> asseblys) {
        this.assemblies = asseblys;
    }

    @OneToMany(mappedBy = "lastPerson")
    private Collection<Scanner> lastScanners;

    public Collection<Scanner> getLastScanners() {
        return lastScanners;
    }

    public void setLastScanners(Collection<Scanner> lastScanners) {
        this.lastScanners = lastScanners;
    }

    @Override
    public String toString() {
        return name+"("+id+")";
    }
}
