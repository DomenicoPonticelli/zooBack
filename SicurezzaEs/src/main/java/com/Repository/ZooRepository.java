package com.Repository;

import com.Entity.Zoo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ZooRepository extends JpaRepository<Zoo, Integer> {
}