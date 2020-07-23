package com.paytmmoney.sip.sipDemo.model.mysql;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "sip_table")
public class SipEntity {

      //public SipEntity() {}

     @Id
     @Column(name = "id")
     @GeneratedValue(strategy = GenerationType.AUTO)
     private int id;

     @Column(name = "userid")
     private int UserId;

     @Column(name = "folioNo")
     private String FolioNo;

     @Column(name = "amount")
     private double Amount;

     @Column(name = "isin")
     private String IsIn;

     @Column(name = "schemename")
     private String SchemeName;

     @Column(name = "nextSipDate")
     private Date NextSipDate;

     @Column(name = "status")
     private String status;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public String getFolioNo() {
        return FolioNo;
    }

    public void setFolioNo(String folioNo) {
        FolioNo = folioNo;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double amount) {
        Amount = amount;
    }

    public String getIsIn() {
        return IsIn;
    }

    public void setIsIn(String isIn) {
        IsIn = isIn;
    }

    public String getSchemeName() {
        return SchemeName;
    }

    public void setSchemeName(String schemeName) {
        SchemeName = schemeName;
    }

    public Date getNextSipDate() {
        return NextSipDate;
    }

    public void setNextSipDate(Date nextSipDate) {
        NextSipDate = nextSipDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
