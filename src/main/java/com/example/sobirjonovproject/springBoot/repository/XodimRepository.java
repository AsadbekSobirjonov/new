package com.example.sobirjonovproject.springBoot.repository;

import com.example.sobirjonovproject.springBoot.entity.Xodim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface XodimRepository extends JpaRepository<Xodim,Long> {
}
