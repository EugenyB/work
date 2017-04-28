package dao;

import dtables.Scanner;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Vladimir on 12.04.2017.
 */

@Stateless
public class ScannerDAO {
    @PersistenceContext
    EntityManager em;
    public List<Scanner> findAll() {
        //return em.createNamedQuery("Scanner.FindAll").getResultList();
        System.out.println(">>>> findAll");
        return em.createQuery("select h from hfwa h").getResultList();
    }
}
