package dao;

import entity.Workers;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class WorkersDAO implements DAO<Workers, Integer> {

    private Session session;

    public WorkersDAO(Session session) {
        this.session = session;
    }

    @Override
    public Workers createOrUpdate(Workers entity) {

        session.saveOrUpdate(entity);
        return entity;
    }

    @Override
    public Workers findById(Integer integer) {

        return session.load(Workers.class, integer);
    }

    @Override
    public void delete(Integer integer) {

        session.delete(findById(integer));
    }

    @Override
    public List<Workers> findAll() {

        return (ArrayList<Workers>) (session.createQuery("from Workers").list());

    }
}
