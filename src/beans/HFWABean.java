package beans;


import dao.HFWADAO;
import dtables.HFWA;

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
public class HFWABean implements Serializable {
    @EJB
    HFWADAO hfwadao;
    public List<HFWA> getHFWAs (){
        return hfwadao.findAll();
    }
}
