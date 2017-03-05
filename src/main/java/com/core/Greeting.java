package com.core;


import lombok.Getter;

/**
 * Created by Garlen on 19/02/2017.
 */
@Getter

public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

}