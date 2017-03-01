package core;



import lombok.Builder;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

/**
 * Created by Garlen on 20/02/2017.
 */
@Getter
@Setter
@Builder
@Entity
public class People {

    private int id;
    private String name;
    private int age;
}
