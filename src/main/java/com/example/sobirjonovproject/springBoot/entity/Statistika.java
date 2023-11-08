package com.example.sobirjonovproject.springBoot.entity;


import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Map;

@Entity
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "statistika")
public class Statistika {

    private Map<String ,Integer> xodimlarsoni;

    private Map<String,Double> xodimlarfoizi;

    private Map<Integer,Integer> xodimyoshi;

    private Double umumiySumma;

}
