package com.example.sobirjonovproject.imtihon.entity;

import java.io.Serializable;

public class Student implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;

    String first_name;

    Integer age;



}
