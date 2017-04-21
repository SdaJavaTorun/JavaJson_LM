package com.sdajava.javajson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by RENT on 2017-04-21.
 */
public class Master {

    public Integer id;
    public String name;
    public String lastname;
    public List<Chief> chiefs = new ArrayList<Chief>();

    public Master(Integer id, String name, String lastname, List<Chief> chiefs) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.chiefs = chiefs;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public List<Chief> getChiefs() {
        return chiefs;
    }

    public void setChiefs(List<Chief> chiefs) {
        this.chiefs = chiefs;
    }
}
