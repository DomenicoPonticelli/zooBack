package com.Repository;

import com.Entity.Prenotazioni;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrenotazioniRepository extends JpaRepository<Prenotazioni, Integer> {
}