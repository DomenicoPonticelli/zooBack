package com.Repository;

import com.Entity.Nutrizione;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NutrizioneRepository extends JpaRepository<Nutrizione, Integer> {
}