package com.example.medicine_audit_system.helper.datasethelper;
import com.github.springtestdbunit.dataset.ReplacementDataSetLoader;

public class ReplacementCsvDataSetLoader extends ReplacementDataSetLoader {
    
    public ReplacementCsvDataSetLoader(){
        super(new CsvDataSetLoader());
    }
}
