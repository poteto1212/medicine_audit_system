package com.example.medicine_audit_system.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name= "testuser")
public class Testuser {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name= "id")
    private Integer id;
    @Column(name= "first_name")
    private String first_name;
    @Column(name= "last_name")
    private String last_name;

    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }

    public String getFirstName(){
        return first_name;
    }

    public void SetFirstName(String first_name){
        this.first_name = first_name;
    }

    public String getLastName(){
        return last_name;
    }

    public void SetLastName(String last_name){
        this.last_name = last_name;
    }
}
