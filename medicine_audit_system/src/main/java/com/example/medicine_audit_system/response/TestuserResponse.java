package com.example.medicine_audit_system.response;
import com.example.medicine_audit_system.record.FullNameRecord;

public class TestuserResponse {
    private final FullNameRecord full_name_record;

   public TestuserResponse(FullNameRecord full_name_record){
       
       this.full_name_record = full_name_record;
   }

   public String getResponse(){
       String full_name = full_name_record.fullname;
       return full_name;
   }
}
