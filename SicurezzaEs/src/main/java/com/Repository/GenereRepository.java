package com.Repository;

import com.Entity.Genere;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenereRepository extends JpaRepository<Genere, Integer> {
}