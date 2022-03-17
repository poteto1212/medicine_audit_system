package com.example.medicine_audit_system.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name= "names")
public class Names {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name= "key")
    private Integer key;
    @Column(name= "name")
    private String name;

    public Integer getKey(){
        return key;
    }
    
    public void setKey(Integer key){
        this.key = key;

    }

    public String getName(){
        return name;
    }

    public void SetName(String name){
        this.name = name;
    }

}
