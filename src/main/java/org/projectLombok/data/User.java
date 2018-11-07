package org.projectLombok.data;

import lombok.Data;

import java.util.Date;

public @Data
class User {

    private String name;
    private String address;
    private int age;
    private Date dob;

    public User(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

}
