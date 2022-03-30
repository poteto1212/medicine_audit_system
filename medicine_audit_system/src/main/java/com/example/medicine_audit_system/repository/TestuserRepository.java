package com.example.medicine_audit_system.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.medicine_audit_system.model.Testuser;

@Repository
public interface TestuserRepository extends JpaRepository<Testuser,Integer> {
    @Query("select u from Testuser u where u.id = :id")
    List<Testuser> select_user_name(@Param("id") int id);
}