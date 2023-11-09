package com.example.sobirjonovproject.imtihon.repository;

import com.example.sobirjonovproject.imtihon.entity.OquvMarkaz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OquvMarkazRepository extends JpaRepository<OquvMarkaz,Long> {
}
