package com.example.sobirjonovproject.springBoot.entity;

import com.sun.istack.NotNull;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

@Entity
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "pasport")
public class Pasport implements Serializable {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String JSHSHIR;

    String familya;

    String ism;

    String otasining_ismi;

    String millati;

    Integer tugilgan_yili;

    String jinsi;
}
