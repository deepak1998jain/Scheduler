package com.paytmmoney.sip.sipDemo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class ResponseDto implements Serializable {

    @JsonProperty(value="meta")
    private MetaDto meta;
    @JsonProperty(value="data")
    private Object data;

    public void setMeta(MetaDto meta) {
        this.meta = meta;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
