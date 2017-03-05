package com.dao;

import com.core.People;

import java.util.List;

/**
 * Created by Garlen on 25/02/2017.
 */

public interface PeopleDao {
    public void add(People person);
    public void edit(People person);
    public void delete(int personID);
    public People getPerson(int personID);
    public List getAllPeople();
}
