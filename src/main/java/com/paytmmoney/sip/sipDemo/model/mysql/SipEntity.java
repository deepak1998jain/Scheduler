package com.paytmmoney.sip.sipDemo.model.mysql;
import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "sip_table")
public class SipEntity {

    public SipEntity() {}

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "userid")
    private long userId;

    @Column(name = "foliono")
    private String folioNo;

    @Column(name = "amount")
    private double amount;

    @Column(name = "isin")
    private String isIn;

    @Column(name = "schemename")
    private String schemeName;

    @Column(name = "nextsipdate")
    private Date nextSipDate;

    @Column(name = "status")
    private String status;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFolioNo() {
        return folioNo;
    }

    public void setFolioNo(String folioNo) {
        this.folioNo = folioNo;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getIsIn() {
        return isIn;
    }

    public void setIsIn(String isIn) {
        this.isIn = isIn;
    }

    public String getSchemeName() {
        return schemeName;
    }

    public void setSchemeName(String schemeName) {
        this.schemeName = schemeName;
    }

    public Date getNextSipDate() {
        return nextSipDate;
    }

    public void setNextSipDate(Date nextSipDate) {
        this.nextSipDate = nextSipDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
