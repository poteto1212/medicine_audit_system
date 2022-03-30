package com.example.medicine_audit_system.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.medicine_audit_system.model.Testuser;
import com.example.medicine_audit_system.record.FullNameRecord;
import com.example.medicine_audit_system.repository.TestuserRepository;
@Service
@Transactional
// #複数テーブルにまたがる複雑なクエリを裁く
public class TestuserService {
    @Autowired
    TestuserRepository testUserRepository;
    public FullNameRecord get_test_user_full_name(int user_id){
        Testuser test_user = testUserRepository.select_user_name(user_id).get(0);

        return new FullNameRecord(
            test_user.getLastName(),
            test_user.getFirstName()
            );
    }    
}
