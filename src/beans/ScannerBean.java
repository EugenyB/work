package beans;


import dao.PersonDAO;
import dao.ScannerDAO;
import dtables.Scanner;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Vladimir on 12.04.2017.
 */
@Named
@SessionScoped
public class ScannerBean implements Serializable {
    @EJB
    ScannerDAO hfwadao;

    public List<Scanner> getHFWAs (){
        return hfwadao.findAll();
    }

}
