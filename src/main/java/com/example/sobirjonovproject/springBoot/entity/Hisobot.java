package com.example.sobirjonovproject.springBoot.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "hisobot")
public class Hisobot{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    Set<String> reklama_turi;
    Double  reklama_xarajati;
    String reklama_muddati;
    LocalDateTime boshlangan_vaqt;

    @ManyToOne
    Xodim xodim;
}
