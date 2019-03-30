package com.springhibernate.Example.JPAhibernateMySql.Model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE", catalog = "sys")
public class Employee {

    @Id
    @Column(name = "EID")
    private int EID;

    @Column(name = "EName")
    private String EName;

    @Column(name = "ENumber")
    private int ENumber;

    public Employee(){

    }

    public int getEID() {
        return EID;
    }

    public void setEID(int EID) {
        this.EID = EID;
    }

    public String getEName() {
        return EName;
    }

    public void setEName(String EName) {
        this.EName = EName;
    }

    public int getENumber() {
        return ENumber;
    }

    public void setENumber(int ENumber) {
        this.ENumber = ENumber;
    }
}
