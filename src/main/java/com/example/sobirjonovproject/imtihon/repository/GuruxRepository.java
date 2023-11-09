package com.example.sobirjonovproject.imtihon.repository;

import com.example.sobirjonovproject.imtihon.entity.Gurux;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuruxRepository extends JpaRepository<Gurux,Long> {
}
