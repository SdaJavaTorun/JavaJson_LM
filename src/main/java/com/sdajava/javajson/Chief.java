package com.sdajava.javajson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by RENT on 2017-04-21.
 */
public class Chief {

    public Integer id;
    public String name;
    public String lastname;
    public Map<Integer, List<Employee>> workers = new HashMap<Integer,List <Employee>>();

    public Chief(Integer id, String name, String lastname, Map<Integer, List<Employee>> workers) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.workers = workers;
    }
}
