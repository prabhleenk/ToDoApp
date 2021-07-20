package com.model;

public class UserLogin {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "UserLogin{" +
                "id=" + id +
                '}';
    }
}
