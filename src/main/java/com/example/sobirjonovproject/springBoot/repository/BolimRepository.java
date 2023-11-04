package com.example.sobirjonovproject.springBoot.repository;

import com.example.sobirjonovproject.springBoot.entity.Bolim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BolimRepository extends JpaRepository<Bolim,Long> {
}
