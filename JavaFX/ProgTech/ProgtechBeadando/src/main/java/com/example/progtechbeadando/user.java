package com.example.progtechbeadando;

public class user {
    int id;
    String name;
    String neptunK;
    String state;

    public user (int id, String name, String neptunK, String state)
    {
        this.id = id;
        this.name = name;
        this.neptunK = neptunK;
        this.state = state;
    }
    public user ()
    {
    }

    @Override
    public String toString() {
        return id + ".(" + state + ") " + name + ", " + neptunK;
    }
}
