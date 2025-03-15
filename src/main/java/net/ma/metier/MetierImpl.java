package net.ma.metier;

import net.ma.dao.IDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("m")
public class MetierImpl implements IMetier {


    private IDao dao;

    public MetierImpl(@Qualifier("d2") IDao dao) {
        this.dao = dao;
    }


    @Override
    public double calcul() {
       double t = dao.getData();
       double res = t*2;
        return  res;
    }
    
}
