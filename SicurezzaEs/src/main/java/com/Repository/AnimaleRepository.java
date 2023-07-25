package com.Repository;

import com.Entity.Animale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimaleRepository extends JpaRepository<Animale, Integer> {
}