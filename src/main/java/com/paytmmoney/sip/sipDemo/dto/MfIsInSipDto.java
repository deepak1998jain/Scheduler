package com.paytmmoney.sip.sipDemo.dto;
import com.paytmmoney.sip.sipDemo.model.mysql.SipEntity;
import java.util.List;

public class MfIsInSipDto {
    private String isin;
    private List<SipEntity> sipInfoList;

    public String getIsin() {
        return isin;
    }

    public void setIsin(String isin) {
        this.isin = isin;
    }

    public List<SipEntity> getSipInfoList() {
        return sipInfoList;
    }

    public void setSipInfoList(List<SipEntity> sipInfoList) {
        this.sipInfoList = sipInfoList;
    }
}
