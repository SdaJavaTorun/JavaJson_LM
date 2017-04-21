package com.sdajava.javajson;

import com.google.gson.Gson;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	List<Employee> list = Arrays.asList(new Employee("1", "Lukasz", "Malkowski", "12"),
            new Employee("2", "Jason", "Bourne", "12000"),
             new Employee("3", "Aga", "Lik", "100"),
             new Employee("4", "Koles", "K", "3021"));


    Gson gson = new Gson();
       Map<Integer, List<Employee>> map = new HashMap<Integer, List<Employee>>();
        map.put(1, list );

        Chief chief1 =new Chief(1,"Lukasz", "Black", map);

        List<Chief> chiefList =
                Arrays.asList(chief1);

        Master master =
                new Master(1, "Boss", "Swiata", chiefList );

        System.out.println(gson.toJson(master));
    }





}
