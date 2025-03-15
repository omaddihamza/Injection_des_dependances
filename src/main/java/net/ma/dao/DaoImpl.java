package net.ma.dao;

import org.springframework.stereotype.Component;

@Component
public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("version base de donne");
        double t = 34;
        return t;
    }
}
