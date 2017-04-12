package dao;

import dtables.HFWA;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Vladimir on 12.04.2017.
 */

@Stateless
public class HFWADAO {
    @PersistenceContext
    EntityManager em;
    public List<HFWA> findAll() {
        return em.createNamedQuery("HFWA.FindAll").getResultList();
    }
}
