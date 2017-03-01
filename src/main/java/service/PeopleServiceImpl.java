package service;

import core.People;
import dao.PeopleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Garlen on 25/02/2017.
 */
@Service
public class PeopleServiceImpl implements PeopleService {

    @Autowired
    private PeopleDao peopleDao;

   // @Transactional
    public void add(People people) {
        peopleDao.add(people);
    }

//    @Transactional
    public void edit(People people) {
        peopleDao.edit(people);
    }

 //   @Transactional
    public void delete(int personID) {
        peopleDao.delete(personID);
    }

//    @Transactional
    public People getPeople(int studentId) {
        return peopleDao.getPerson(studentId);
    }

//    @Transactional
    public List getAllPeople() {
        return peopleDao.getAllPeople();
    }
}
