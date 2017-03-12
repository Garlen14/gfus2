package com.core;



import lombok.Builder;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Garlen on 20/02/2017.
 */
@Getter
@Setter
@Table(name ="People")
@Builder
@Entity
public class People {

    private int id;
    private String name;
    private int age;
}
