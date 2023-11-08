package com.example.sobirjonovproject.springBoot.repository;

import com.example.sobirjonovproject.springBoot.entity.Hisobot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HisobotRepository  extends JpaRepository<Hisobot,Long> {
}
