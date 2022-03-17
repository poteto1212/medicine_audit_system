package com.example.medicine_audit_system.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.medicine_audit_system.model.Names;

@Repository
public interface NamesRepository extends JpaRepository<Names,Integer> {}