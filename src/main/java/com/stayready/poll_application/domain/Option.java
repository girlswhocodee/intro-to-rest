package com.stayready.poll_application.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity 
public class Option {

    @Id
    @GeneratedValue
    @Column(name = "OPTION_ID")
    private Long id;
    @Column(name = "OPTION_VALUE")
    private String value;

    public void setId(Long id){
        this.id = id;
    }

    public Long getId(){
        return this.id;
    }

    public void setValue(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }

    
}