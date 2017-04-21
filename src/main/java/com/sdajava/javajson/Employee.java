package com.sdajava.javajson;

/**
 * Created by RENT on 2017-04-21.
 */
public class Employee {

    private String id;
    private String name;
    private String lastname;
    private String salary;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public Employee(String id, String name, String lastname, String salary) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
