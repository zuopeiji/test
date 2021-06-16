package com.bjpowernode;

public class entity {

    private Integer id;
    private String name;
    private Integer age;

    public entity() {
    }

    public entity(Integer id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "entity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
