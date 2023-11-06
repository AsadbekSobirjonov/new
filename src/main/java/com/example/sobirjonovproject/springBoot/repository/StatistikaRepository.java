package com.example.sobirjonovproject.springBoot.repository;

import com.example.sobirjonovproject.springBoot.entity.Statistika;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatistikaRepository extends JpaRepository<Statistika,Long> {
}
