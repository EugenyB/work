package beans;



import dao.PersonDAO;
import dtables.Person;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Vladimir on 12.03.2017.
 */
@Named
@SessionScoped
public class PersonBean implements Serializable{
    @EJB
    PersonDAO personDAO;

    private Person current;

    public Person getCurrent() {
        return current;
    }

    public void setCurrent(Person current) {
        this.current = current;
    }


    public List<Person> getPeople() {
        return personDAO.findAll();
    }

    public String login() {
        return "success";
    }
}
