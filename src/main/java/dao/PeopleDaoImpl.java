package dao;

import core.People;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Garlen on 25/02/2017.
 */
@Repository
public class PeopleDaoImpl implements PeopleDao {
    @Autowired
    private SessionFactory session;

    @Override
    public void add(People person) {
        session.getCurrentSession().save(person);
    }

    @Override
    public void edit(People person) {
        session.getCurrentSession().update(person);
    }

    @Override
    public void delete(int personID) {
        session.getCurrentSession().delete(getPerson(personID));
    }


    @Override
    public People getPerson(int personID) {
        return (People) session.getCurrentSession().get(People.class, personID);
    }

    @Override
    public List getAllPeople() {
        return session.getCurrentSession().createQuery("from People").list();
    }

}
