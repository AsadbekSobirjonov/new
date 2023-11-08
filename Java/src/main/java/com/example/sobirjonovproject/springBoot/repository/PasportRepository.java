package com.example.sobirjonovproject.springBoot.repository;
import com.example.sobirjonovproject.springBoot.entity.Pasport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PasportRepository extends JpaRepository<Pasport,Long> {
}
