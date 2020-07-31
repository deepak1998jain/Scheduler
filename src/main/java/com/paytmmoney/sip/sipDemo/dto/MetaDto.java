package com.paytmmoney.sip.sipDemo.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class MetaDto implements Serializable{
    public static final long serialVersionUID = 1L;
    private String code;
    private String message;
    private String responseId;
    private String requestId;
    private String displayMessage;

    public MetaDto(){}

    public MetaDto(String code, String message, String responseId) {
        this.code = code;
        this.message = message;
        this.responseId = responseId;
    }

    public MetaDto(String code, String message, String requestId, String responseId) {
        this.code = code;
        this.message = message;
        this.responseId = responseId;
        this.requestId = requestId;
    }

    public MetaDto(String code, String message, String responseId, String requestId, String displayMessage) {
        this.code = code;
        this.message = message;
        this.responseId = responseId;
        this.requestId = requestId;
        this.displayMessage = displayMessage;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getResponseId() {
        return responseId;
    }

    public void setResponseId(String responseId) {
        this.responseId = responseId;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getDisplayMessage() {
        return displayMessage;
    }

    public void setDisplayMessage(String displayMessage) {
        this.displayMessage = displayMessage;
    }
}
