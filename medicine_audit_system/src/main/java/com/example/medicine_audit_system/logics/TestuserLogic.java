package com.example.medicine_audit_system.logics;
import com.example.medicine_audit_system.service.TestuserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.medicine_audit_system.record.FullNameRecord;

// #業務ロジック
@Component
public class TestuserLogic {
    @Autowired
    TestuserService testuserService;

    public FullNameRecord get_test_user_full_name(int user_id){
        FullNameRecord full_name_record = testuserService.get_test_user_full_name(user_id);

      return full_name_record ;
    }
}
