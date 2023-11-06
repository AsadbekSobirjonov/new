package com.example.sobirjonovproject.oop.elektronicks.entity;

import java.util.Collections;
import java.util.List;

public class Music {
    private List<String> name;

    public Music(String name) {
        this.name = Collections.singletonList(name);
    }

    public List<String> getName() {
        return name;
    }

    public void setName(String name) {
        this.name = Collections.singletonList(name);
    }
}
