package com.example.sobirjonovproject.springBoot.entity;

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
@Table(name = "xodim")
public class Xodim implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @OneToOne
    Pasport pasport;

    Integer age;

    String manzili;

    @ManyToOne
    Bolim bolim;

    @ManyToOne
    Lavozim lavozim;

    Double maoshi;

}
