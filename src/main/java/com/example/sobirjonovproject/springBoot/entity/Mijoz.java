package com.example.sobirjonovproject.springBoot.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "mijoz")
public class Mijoz implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @OneToOne
    Pasport pasport;

    String manzili;

    LocalDateTime date;

    @ManyToMany
    @JoinTable(name = "mijoz_xodim",
            joinColumns = {@JoinColumn(name = "mijoz_id",referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name ="xodim_id",referencedColumnName = "id")})
    Set<Xodim> xodim;


}
