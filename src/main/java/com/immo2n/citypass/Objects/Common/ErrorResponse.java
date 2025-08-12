package com.immo2n.citypass.Objects.Common;

import com.immo2n.citypass.Objects.GlobalResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class ErrorResponse extends GlobalResponse {
    public ErrorResponse(String message, int code) {
        this.success = false;
        this.message = message;
        this.data = null;
        this.code = code;
    }
    public  ErrorResponse(String message, int code, Object data) {
        this.success = false;
        this.message = message;
        this.data = data;
        this.code = code;
    }
}