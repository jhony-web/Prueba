package com.RestAPI1.domain;

/**
 * POJO
 */
public class Customer {

    //attributes
    private int ID;
    private String name;
    private String username;
    private String password;

    //constructor
    public Customer(int ID, String name, String username, String password) {
        this.ID = ID;
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setName(String name) {
        this.name = name;
    }


}
