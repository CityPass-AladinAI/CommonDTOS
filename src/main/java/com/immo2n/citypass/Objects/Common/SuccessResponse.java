package com.immo2n.citypass.Objects.Common;

import com.immo2n.citypass.Objects.GlobalResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class SuccessResponse extends GlobalResponse {
    public SuccessResponse(String message) {
        this.success = true;
        this.message = message;
        this.data = null;
        this.code = 200;
    }
    public  SuccessResponse(String message, Object data) {
        this.success = true;
        this.message = message;
        this.data = data;
        this.code = 200;
    }
}
