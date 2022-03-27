package com.example.medicine_audit_system.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.medicine_audit_system.model.Testuser;

@Repository
public interface TestuserRepository extends JpaRepository<Testuser,Integer> {}