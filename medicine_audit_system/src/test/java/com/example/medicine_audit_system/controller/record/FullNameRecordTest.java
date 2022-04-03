package com.example.medicine_audit_system.controller.record;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.medicine_audit_system.record.FullNameRecord;

import org.junit.jupiter.api.Test;

public class FullNameRecordTest {
    @Test
    public void 苗字と名前を渡すと属性にフルネームが保持される() throws Exception{
        String lastname = "いとう";
        String firstname = "まこと";
        FullNameRecord full_namerecord = new FullNameRecord(lastname, firstname);

        assertEquals("いとうまこと", full_namerecord.fullname);
    }
}
