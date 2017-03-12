package dao;

import dtables.Person;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Vladimir on 12.03.2017.
 */
@Stateless
public class PersonDAO {
    @PersistenceContext
    EntityManager em;

    public List<Person> findAll() {
        return em.createQuery("select p from Person p").getResultList();
    }
}
