package service;

import core.People;

import java.util.List;

/**
 * Created by Garlen on 25/02/2017.
 */
public interface PeopleService {
    public void add(People student);
    public void edit(People student);
    public void delete(int personId);
    public People getPeople(int personId);
    public List getAllPeople();
}
