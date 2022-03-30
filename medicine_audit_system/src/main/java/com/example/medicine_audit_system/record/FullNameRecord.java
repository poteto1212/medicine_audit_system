package com.example.medicine_audit_system.record;

public class FullNameRecord {
    private String lastname;
    private String firstname;

    public FullNameRecord(String lastname , String firstname){
        this.lastname = lastname;
        this.firstname = firstname;
    }

    public String full_name(){
        return lastname + firstname;
    }
    
}
