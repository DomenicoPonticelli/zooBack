package com.Repository;

import com.Entity.Dipendenti;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DipendentiRepository extends JpaRepository<Dipendenti, Integer> {
}