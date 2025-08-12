package com.immo2n.citypass.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GlobalResponse {
    protected String message;
    protected boolean success;
    protected int code;
    protected Object data;
}