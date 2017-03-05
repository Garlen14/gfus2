package com.service;

import com.core.People;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Garlen on 25/02/2017.
 */
@Component
public interface PeopleService {
    public void add(People student);
    public void edit(People student);
    public void delete(int personId);
    public People getPeople(int personId);
    public List getAllPeople();
}
