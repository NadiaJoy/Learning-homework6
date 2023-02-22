package org.example;

//Part2
//ex.6
public class User {
    String name;
    int id;
    int age;

    //ex.7
    public User(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    //ex.8
    public User() {
    }

    public String nameUpdate() {
        return this.name = name + "Updated";
    }
}
