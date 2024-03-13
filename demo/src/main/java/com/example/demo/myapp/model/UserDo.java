package com.example.demo.myapp.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDo {
    private  String name;
    private  Integer age;

    public void setAge(int i) {
        this.age = i;
    }

    public void setName(String name) {
        this.name = name;
    }
}
