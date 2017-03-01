package core;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by Garlen on 21/02/2017.
 */
@Service
public class DbService {


//    @Autowired
//    private SessionFactory sessionFactory;
//
//    // this is straight-up HQL... really, no magic here
//    @SuppressWarnings("unchecked")
//    public Collection<People> getAllThePeople() {
//        return sessionFactory.getCurrentSession()
//                .createQuery("from People e ")
//                .list();
//    }
}
