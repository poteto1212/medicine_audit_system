package com.example.medicine_audit_system.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.medicine_audit_system.model.Names;
import com.example.medicine_audit_system.repository.NamesRepository;
@Service
@Transactional
public class NameService {
    @Autowired
    NamesRepository namesRepository;
    public List<Names> findAllNameData(){
        return namesRepository.findAll();
    }
}
