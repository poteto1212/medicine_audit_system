package com.example.medicine_audit_system.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.medicine_audit_system.model.Testuser;
import com.example.medicine_audit_system.repository.TestuserRepository;
@Service
@Transactional
public class TestuserService {
    @Autowired
    TestuserRepository testUserRepository;
    public List<Testuser> findAllNameData(){
        return testUserRepository.findAll();
    }
}
